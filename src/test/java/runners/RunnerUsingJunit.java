package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
		features="src/test/resources/features",
		//features="src/test/resources/features/gmailhomepage.feature",
		glue="stepdefination",
		monochrome=true, //detailed view in console
		plugin = {"pretty", "html:target/report/"}, //by default cucumber reporting
		tags= {"@dataset"}
		)

//And ---Smoke and Regression
//OR -----{"@Smoke, @Regression"}

//tags = {"@Smoke", "@Regression"} // AND
//tags = {"@Smoke, @Regression"} //OR

//ignore testcase tags= {"~@tagname"}


@RunWith(Cucumber.class)
public class RunnerUsingJunit {

	
	//@RunWith ---it is part of junit ---it displays that u are running runner file using junit
	//@Cucumber Options ---part of cuucmber ---
//	where is our feature
//	where is step defination
	
	
}
