package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features\\Login.feature" ,glue= {"StepDefinitions"},plugin = {"html:target\\HTMLreports\\report.html"})

public class testrunner {
    
    }
