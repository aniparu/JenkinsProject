package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample extends BaseClass{
	PojoClasses  pc;
	@Given("launch the browser and max window")
	public void launch_the_browser_and_max_window() {
	   browserLaunch();
	   browserMaximize();
	}

	@When("launch the url of the application")
	public void launch_the_url_of_the_application() {
	   loadUrl("https://www.facebook.com/");
	}

	@When("pass the positive and negative {string} in email field")
	public void pass_the_positive_and_negative_in_email_field(String em) {
		pc=new PojoClasses();
		fill(pc.getEmailTxt(), em);
	}

	@When("pass the positive and negative {string} in password field")
	public void pass_the_positive_and_negative_in_password_field(String pa) {
		pc=new PojoClasses();
		fill(pc.getPassTxt(),pa);
	}

	@Then("close the browser")
	public void close_the_browser() {
	  closeTheBrowser();
	}


}
