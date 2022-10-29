package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\anipa\\eclipse-workspace\\Cucumber6PM\\src\\test\\resources\\failed.txt",
glue="org.stepdefinition",monochrome=true)

public class TestRerun {

}
