package runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//This is used when we have to run specific files.

//To specify the path of feature files and glue it with step definition files.
@CucumberOptions(features = {"C:\\Users\\Aniket\\eclipse-workspace\\BDDCucumber\\src\\test\\resources\\forms\\Simple_Form.feature"},glue= {"step_definations"}) 
public class Simple_Form_Runner {
	
	
}
