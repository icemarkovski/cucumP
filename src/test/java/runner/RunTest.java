package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resourcess/features",glue={"stepdefinitions","hooks"},plugin={"pretty","html:target/CucumberReport.html"},publish=true)

public class RunTest {
	
	//if we want to run file through maven we need to provide TEST keyword in names of 
	//step definition java files runner class file of the cucumber project 
	//"test" word must be inside name of the files example - LoginTest or RunTest;
}
