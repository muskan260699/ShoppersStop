package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"C:\\Users\\muskagup\\eclipse-workspace\\Training\\FeatureFile\\f.feature"}
	,glue= {"stepdef","base"}
	,tags= {"@tag1"}
)

public class SSrunner extends AbstractTestNGCucumberTests{

}
