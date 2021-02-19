package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Featurefiles/selectproduct.feature"}
		,glue = {"stepDefinition"}
		,tags = "@selectproduct"
		)

public class SelectPro_testRunner extends AbstractTestNGCucumberTests{

}
