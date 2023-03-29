package com.etsy.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/etsy",//features is all about feature files,copy from weborder package
        glue =  "com/etsy/stepdefinitions",//copying from package stepdefinitons
        dryRun=false, //getting snips without executing
        tags = "@regression2",
        //and refers to one scenario
        //or refers to multiple scenarios
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)


public class EtsyRunner {
}
