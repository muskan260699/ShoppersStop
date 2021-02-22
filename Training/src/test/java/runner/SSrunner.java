package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"FeatureFile/f.feature"}
	,glue= {"stepdef","base"}
	,tags= {"@tag4"}
)

public class SSrunner extends AbstractTestNGCucumberTests{

}
