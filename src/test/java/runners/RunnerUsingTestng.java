package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/features",
		//features="src/test/resources/features/gmailhomepage.feature",
		glue="stepdefination",
		monochrome=true, //detailed view in console
		plugin = {"pretty", "html:target/report/"}, //by default cucumber reporting
		tags= {"@dataset"}
		)

//@Runwith ----nhi ata
public class RunnerUsingTestng extends AbstractTestNGCucumberTests{

}
