package mytestrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features = {"src/test/resource/feature/makemytrip.feature"},	
		glue= {"stepdefinition"},
		monochrome = true, snippets=SnippetType.CAMELCASE,
    plugin = {"pretty", "html:target/cucumber-html-report"},
    dryRun=false

	
)
public class TestRunner extends AbstractTestNGCucumberTests  {

}
