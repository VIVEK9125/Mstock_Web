package hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import page_factory.DriverFactory;
import utility.propertyReader;

public class ApplicationHooks 
{
	WebDriver driver;
	@Before
	public void openBrowser() throws IOException {
		DriverFactory df = new DriverFactory();
		String browserName = propertyReader.readpropertydata("browsername");
		 String browserFromCommandPrompt = System.getProperty("cliBrowser");
		 String envValue = System.getProperty("env");
		 System.out.println(envValue);
		 if(browserFromCommandPrompt !=null) {
			 browserName = browserFromCommandPrompt;
		 }
		 driver = df.intiBrowser(browserName);
		driver.manage().window().maximize();
	}
	@After(order=2)
	public void teardown(Scenario scenario){
		boolean Screnshotfail = scenario.isFailed();
		if(Screnshotfail) {
			String verifyname = scenario.getName();
			String updatename = verifyname.replaceAll(" ", "_");
			TakesScreenshot js = (TakesScreenshot)driver;
			 byte[] bitevalue = js.getScreenshotAs(OutputType.BYTES);
			scenario.attach(bitevalue, "image/png/jpge", updatename);
		}
	}
	@After(order=1)
	public void closewindow() {
		driver.quit();
	}

}
