package com.smartbear.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/smartbear",//features is all about feature files,copy from weborder package
        glue =  "com/smartbear/stepdefinitions",//copying from package stepdefinitons
        dryRun=true, //getting snips without executing
        tags = "@regression",
        //and refers to one scenario
        //or refers to multiple scenarios
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class SmartBearRunner {

}
