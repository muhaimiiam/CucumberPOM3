package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/pom/features",
		glue={"com/pom/stepDef"}, 
		monochrome = true, 
		stepNotifications = true,
		strict = true,
//		plugin = {"pretty",
//		"html:target/HtmlReports", 
//		"json:target/JSONReports/report.json",
//		"junit:target/JUnitReports/report.xml"}
		plugin= {"pretty"
//				,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)

public class TestRunner001 {

}
