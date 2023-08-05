package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"AllFeatures"},
		glue = {"StepDefLayer"},
		dryRun = false
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests {
	

}
