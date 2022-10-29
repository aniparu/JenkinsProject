package org.stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass {
	
	PojoClasses   pc ;//global 
	
	@Given("To launch the browser and max window")
	public void to_launch_the_browser_and_max_window() {
		browserLaunch();
		browserMaximize();
		
	  
	}

	@When("To launch the url of the application")
	public void to_launch_the_url_of_the_application() {
		loadUrl("https://www.facebook.com/");
	   
	}

	@When("To pass vaild username in email field")
	public void to_pass_vaild_username_in_email_field() {
		pc=new PojoClasses();
		fill(pc.getEmailTxt(), "python123@gmail.com");
	   
	}

	@When("To pass vaild password in password field")
	public void to_pass_vaild_password_in_password_field() {
		pc=new PojoClasses();
		fill(pc.getPassTxt(),"2345678904567");
		
		Assert.assertTrue(false);
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		pc=new PojoClasses();
		btnClick(pc.getLoginFindAll());
	  
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeTheBrowser();
	   
	}
	
}
