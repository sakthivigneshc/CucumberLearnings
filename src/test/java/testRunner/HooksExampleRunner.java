package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/cucumberExample/HooksDemoExample.feature"},
		dryRun =  false,
		glue = {"hooksstepsExample","hooks"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)
public class HooksExampleRunner extends AbstractTestNGCucumberTests {
}


 



