package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignIn extends BaseClass {
	
	public AmazonSignIn() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signinBtn;
	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}
	

}
