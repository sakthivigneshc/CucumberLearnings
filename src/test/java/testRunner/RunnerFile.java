package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/cucumberExample/login.feature"},
		dryRun = false,
		glue ="stepDefinitions",
		snippets = SnippetType.CAMELCASE
//		monochrome = true
		)
public class RunnerFile extends AbstractTestNGCucumberTests {
}


/*
===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 6, Passes: 6, Failures: 0, Skips: 0
===============================================


*/    
