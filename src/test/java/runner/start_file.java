package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\SARAN\\Documents\\workspace\\unittest\\src\\test\\resources\\Forms\\form.feature"}, 
		glue = {"Steps"}
		
		)
public class start_file {

}
