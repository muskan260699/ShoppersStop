package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/beauty.feature"}
		,glue = {"stepDefinition","base"}
		)

public class BeautyRunner extends AbstractTestNGCucumberTests {

}
