package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src\\main\\resources\\MStockFeature\\MStocklogin.feature"},
		glue= {"MStockStep"},
		plugin= {"pretty","html:target/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)

public class Mstock extends AbstractTestNGCucumberTests{

}
