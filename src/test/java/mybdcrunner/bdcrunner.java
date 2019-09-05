package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
@CucumberOptions(features="features99",glue ="bdcstepdefinitions",tags= {"@Sanity"},
	plugin = {"pretty","html:target/cucumber-html-report","json:target/ashdemo_JSON-report"})
	public class bdcrunner {	
}
