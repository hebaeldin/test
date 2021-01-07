package Runner;

import again.Review.TestBase;
import cucumber.api.CucumberOptions;
@CucumberOptions(features="src\\test\\java\\Features", glue= {"agian.Review"},  plugin= {"pretty","html:target/cucumber-html-report"})
public class testRunner extends TestBase{


	
	
}
