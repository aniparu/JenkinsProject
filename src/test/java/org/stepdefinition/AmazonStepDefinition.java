package org.stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonStepDefinition extends BaseClass{
	
	@Given("To launch the chrome browser and max the browser")
	public void to_launch_the_chrome_browser_and_max_the_browser() {
		browserLaunch();
		browserMaximize();
		
	   
	}

	@When("To launch the amazon url")
	public void to_launch_the_amazon_url() {
	   loadUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58075519359%26hvpone%3D%26hvptwo%3D%26hvadid%3D486462454211%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D382777551823156601%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061892%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2154371%26gclid%3DCjwKCAjw-rOaBhA9EiwAUkLV4hKelrNvxLtnCOBxuTDOJxsIAZA0T7wMF_GO4KbyWci-jvb5HHkZ7BoCL60QAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}


	@When("To pass the invalid username or phoneNo in email field")
	public void to_pass_the_invalid_username_or_phoneNo_in_email_field(DataTable dt) {
		Map<String, String>  m= dt.asMap(String.class,String.class );
		AmazonSignIn  a = new AmazonSignIn();
	    fill(a.getUsername(), m.get("username2"));
	}

	@When("To click the Continue button")
	public void to_click_the_Continue_button() {
		AmazonSignIn  a = new AmazonSignIn();
		btnClick(a.getContinuebtn());
	}
	
	@When("To pass the invalid password in password field")
	public void toPassTheInvalidPasswordInPasswordField(DataTable dt) {
		List<Map<String, String>>   m1= dt.asMaps();
		
		AmazonSignIn  a = new AmazonSignIn();
	    fill(a.getPassword(),m1.get(0).get("password2"));
	   
	}

	@When("To click the signin button")
	public void toClickTheSigninButton() {
		AmazonSignIn  a = new AmazonSignIn();
		btnClick(a.getSigninBtn());
	   
	}


	
	
	

}
