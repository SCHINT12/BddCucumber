package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/orderflow.feature",glue ={"stepdefinitions"},monochrome = true,
		plugin= {"pretty","html:target/cucumber.html"})	
public class runnerOrderflow {

}
