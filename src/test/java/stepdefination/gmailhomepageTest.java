package stepdefination;

import java.util.List;

import cucumber.api.java.en.Then;

public class gmailhomepageTest {
	
	@Then("I verify title of gmail page")
	public void i_verify_title_of_gmail_page() {
	    System.out.println("Verifying title of gmail page");
	    
	    //Function name and assertion
	}

	@Then("I verify below components")
	public void i_verify_below_components() {
	    System.out.println("Verifying below components");
	}
	
	@Then("I verify below components {string}")
	public void i_verify_below_components(String string) {
	    System.out.println("checking component "+string);
	}
	
	@Then("I verify below components of gmail homepage")
	public void i_verify_below_components_of_gmail_homepage(io.cucumber.datatable.DataTable dataTable) {
		//datatable in cucumber
		
		List<String> allcomponents = dataTable.asList();
		for(String e: allcomponents) {
			System.out.println("Checking component "+e);
		}
	}

}
