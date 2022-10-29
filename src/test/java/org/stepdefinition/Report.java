package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources", glue = "org.stepdefinition", monochrome = true, dryRun = false, strict = true, snippets = SnippetType.CAMELCASE, plugin = {
		"html:target", "junit:JunitReport\\JunitRepo.xml", "json:JsonReport\\JsonRepo.json" })

public class Report {

	public static void createJvmReport(String jsonFilePath) {

		// 1.Mention the target folder location
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\Cucumber6PM\\src\\test\\resources\\JvmReport");

		// 2.Add details to the report using Configuration class

		Configuration c = new Configuration(f, "Cucumber6Pm");
		c.addClassifications("Platform Name", "Windows");
		c.addClassifications("Platform Version", "105");
		c.addClassifications("Browser Name", "chrome");
		c.addClassifications("Browser Version", "98.0");
		c.addClassifications("sprint No", "3");

		// 3.Add json file paths into List<String>
		List<String> l = new ArrayList<String>();
		l.add(jsonFilePath);
		
		
		//4.4.Create object for ReportBuilder class and using the created object call generateReports() method.
		ReportBuilder   r = new ReportBuilder(l, c);
		
		r.generateReports();
		
		
		
		
		
		
		
		
		
		
		

	}

}
