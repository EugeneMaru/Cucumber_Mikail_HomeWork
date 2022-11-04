package com.mikail_homeWork.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/mikail_homeWork/step_def",
        dryRun = false,
        tags = "@wip"

)

public class Runner {

}
