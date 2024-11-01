package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/orderflow.feature",glue ={"stepdefinitions"},monochrome = true,tags = "@test1",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)	

public class runnerOrderflowwithReports {

}