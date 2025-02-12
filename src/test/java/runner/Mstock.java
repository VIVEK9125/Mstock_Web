package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src\\test\\resource\\MStock_Web\\MStock_Login_Page.feature"},
		glue= {"MStockStep"},
		plugin= {"pretty","html:tatrget/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)

public class Mstock extends AbstractTestNGCucumberTests{

}
