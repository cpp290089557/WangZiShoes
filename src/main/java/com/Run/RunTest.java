package com.Run;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/features/firstCucumber.feature"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumberjson.json"},
        tags = {"@p2"},
        glue = {"com.steps"}
)
public class RunTest extends AbstractTestNGCucumberTests {
    public RunTest() {
    }
}

