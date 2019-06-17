package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Test3\\TestDemoBDD\\src\\main\\java\\features\\tagging.feature"
        , glue = {"stepDefinitions"},//path of step definition files
        format = {"pretty","html:test-output"}, //To generate different types of reporting output in the console either in html or json or xml
        dryRun = true, //to check the mapping between feature file and stepdefinition file
        monochrome = false , //It is used to display the console output in a more readable format
        strict= true, //It will check if any step is not defined in step definition file
        tags={"@EndToEndTest"}
)
public class TestRunner {

}
