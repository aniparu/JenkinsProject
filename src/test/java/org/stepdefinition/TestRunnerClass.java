package org.stepdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources", glue = "org.stepdefinition",
monochrome = true, dryRun = false, 
strict = true, 
snippets = SnippetType.CAMELCASE,
plugin= {"html:target","junit:JunitReport\\JunitRepo.xml","json:JsonReport\\JsonRepo.json","rerun:src\\test\\resources\\failed.txt"})
public class TestRunnerClass {
	
	@AfterClass
	public static void report() {
		Report.createJvmReport("C:\\Users\\anipa\\eclipse-workspace\\Cucumber6PM\\JsonReport\\JsonRepo.json");
		

	}
	
	


}
