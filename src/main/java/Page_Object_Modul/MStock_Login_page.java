package Page_Object_Modul;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MStock_Login_page 
{
	WebDriver driver;
	private WebDriverWait wait;
	List<WebElement> links;
	JavascriptExecutor Jv = (JavascriptExecutor)driver;
	
	String referurl = "https://trade.mstock.com/#/";
	@FindBy(xpath = "//input[@name='username']")
	private WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;
    @FindBy(xpath = "//button[text()='LOGIN']")
    private WebElement loginbtn;
    @FindBy(xpath = "//button[text()='I understand, continue']")
    private WebElement continuebtn;
    @FindBy(xpath = "//*[@class='hamburger']")
    private WebElement hamburger;
    @FindBy(xpath = "(//div[@class='wzrk-alert wiz-show-animate']//button)[1]") 
    private WebElement handlepopup;
    
    public MStock_Login_page(WebDriver driver) {
    	this.driver =driver;
		PageFactory.initElements(driver, this);
		
    	
    }
    
    public void launchurl() {
//    	 try {
//             // URL to test
//             String URL = "https://trade.mstock.com/#/";
//
//             // Start measuring time
//             long startTime = System.currentTimeMillis();
//
//             // Navigate to the page
//             driver.get(URL);
//             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//             // Wait for the page to load completely
//             JavascriptExecutor js=(JavascriptExecutor)driver;
//             while (!js.executeScript("return document.readyState").toString().equals("complete")) {
//                 Thread.sleep(100); // Check every 100ms
//             }
//
//             // End measuring time
//             long endTime = System.currentTimeMillis();
//
//             // Calculate load time
//             long loadTime = endTime - startTime;
//             System.out.println("IPO PAGE LOADED IN: " + loadTime + " ms");
//         } catch (InterruptedException e) {
//             System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
//         }
    	
    	driver.get("https://trade.mstock.com/#/");
    }

    public void pophandle() {
   	 try {
            //wait.until(ExpectedConditions.visibilityOf(handlepopup));
            // Handle the pop-up (e.g., close it)
   		 handlepopup.click();
            System.out.println("Pop-up handled successfully.");
        } catch (NoSuchElementException e) {
            // Pop-up not found, handle accordingly
            System.out.println("Pop-up not found.");
        }
   }
    public void enterusername() throws InterruptedException {
    	Thread.sleep(1000);
    	Username.sendKeys("9075794960");
    }
    public void enterpass() {
    	Password.sendKeys("Vivek@91255",Keys.ENTER);
    }
    public void loginbtn() {
    	loginbtn.click();
    }
    public void clkcontineus() throws InterruptedException {
    	Thread.sleep(2000);
    	continuebtn.click();
    }



}
