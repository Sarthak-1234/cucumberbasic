package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class gmailLoginTest {
	
	//feature unki coding hogi
	
	@Given("I launch gmail url")
	public void i_launch_gmail_url() {
	    System.out.println("Launching gmail");
	}

	@When("I enter {string}")
	public void i_enter(String string) {
	    System.out.println("Entering "+string);
	}

	@When("I click on Next button")
	public void i_click_on_Next_button() {
	    System.out.println("Clicking Next button");
	}

	@Then("I am able to login")
	public void i_am_able_to_login() {
	    System.out.println("Verifying login");
	}
	
	@Then("I am seeing error message")
	public void i_am_seeing_error_message() {
	    System.out.println("I am seeing error message");
	    //Assert.assertTrue(false);
	}

}
