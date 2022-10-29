package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClasses extends BaseClass{
	
	// only maintain login page

		// 1.Non-parametrized constructor
		public PojoClasses() {
			PageFactory.initElements(driver, this);
			
		}

		// 2.private webelements
		// webelement usernamedriver.findelement(by.id("email"))
		@CacheLookup
		@FindBy(id = "email")
		private WebElement emailTxt;
		
	    @CacheLookup
		@FindBy(name = "pass")
		private WebElement passTxt;
	    
		@CacheLookup
		@FindBy(name="")
		private WebElement btnLogin;
		
		@CacheLookup
		@FindBys({  //Acts like an and operator
			@FindBy(xpath="//button[@name='login']"),
			@FindBy(xpath="//button[@type='submit']"),
			@FindBy(xpath="//button[@id='u_0_5_Lk']"),
			@FindBy(xpath="//button[text()='Log in']")
		})
		
		private WebElement loginFindBys;
		
		@CacheLookup
		@FindAll({    //Acts like an OR Operator
			@FindBy(xpath="//button[@name='login']"),
			@FindBy(xpath="//button[@type='submit']"),
			@FindBy(xpath="//button[@id='u_0_5_Lk']"),
			@FindBy(xpath="//button[text()='Log in']")
		})
		private WebElement loginFindAll;

		

		public WebElement getLoginFindBys() {
			return loginFindBys;
		}

		public WebElement getLoginFindAll() {
			return loginFindAll;
		}

		// Getters to access those webelements to outside of class
		public WebElement getEmailTxt() {
			return emailTxt;
		}

		public WebElement getPassTxt() {
			return passTxt;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}
		
		
		
		

}
