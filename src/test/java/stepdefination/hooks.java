package stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	@Before
	public void beforescenario() {
		System.out.println("====================Starting Scearnio=======================");
	}
	
	@After
	public void afterscenario() {
		System.out.println("=======================Ending Scearnio=======================");
	}

}
