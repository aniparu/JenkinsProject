package org.stepdefinition;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClasses extends BaseClass {
	
	
	
	@Before(order=51)
	public void preCondition1() {
		browserLaunch();
	
	}
	@Before(order=90)
	public void preCondition2() {		
		browserMaximize();
		System.out.println("Window maximize");
	}
	
	//each scenario it will be execute which is presented in all feature file
	
	@After(order=54)
	public void postCondition1(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot   ts = (TakesScreenshot) driver;
			byte[] sc = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image.png");
			System.out.println("Failed Scenario name:"+s.getName());
			
		}
		
	}
	
	@After(value="@Regression")
	public void postCondition2() {
		closeTheBrowser();
	}
	
	
	
	
	

}
