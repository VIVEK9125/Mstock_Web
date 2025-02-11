package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class propertyReader 
{
	
	WebDriver  driver;
	JavascriptExecutor Jv = (JavascriptExecutor)driver;
	public static String readpropertydata(String propertyread) throws IOException {
		String path = System.getProperty("user.dir")+"\\src\\main\\resources\\Configd.properties";
		
	FileInputStream File = new FileInputStream(path);
	Properties pro = new Properties();	
	pro.load(File);
	String namevalue = pro.getProperty(propertyread);
	return namevalue;
	}
//	---------------------------------------------------------------------------------------------------------------
	
		//Take Screenshot
		public void takeScreenshot() {
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		}
		//-----------------------------------------------------------------------------------------------------------
		
		
		//Scrolling up and down
		public void scrolling() {
			JavascriptExecutor Jv = (JavascriptExecutor)driver;
			//down by specific no of the pixcel
			Jv.executeScript("window.scrollBy(0,900)");
			//Scroll to the bottom
			Jv.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		}
		
		//-------------------------------------------------------------------------------------------------------
	
	

}
