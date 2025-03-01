package Page_Object_Modul;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MStock_Login_page 
{
	WebDriver driver;
	private WebDriverWait wait;
	List<WebElement> links;
	JavascriptExecutor Jv = (JavascriptExecutor)driver;
	 long startTime;
	    long endTime;
	
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
    @FindBy(xpath = "//p[text()='2 Factor Authentication']")
    private WebElement title;
    @FindBy(xpath = "//span[@class='code-hidden empty']")
    private WebElement otp;
    
    public MStock_Login_page(WebDriver driver) {
    	this.driver =driver;
		PageFactory.initElements(driver, this);
		
    	
    }
    
    public void launchurl() {
    	 try {
             // URL to test
             String URL = "https://trade.mstock.com/#/";

             // Start measuring time
             long startTime = System.currentTimeMillis();

             // Navigate to the page
             driver.get(URL);
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

             // Wait for the page to load completely
             JavascriptExecutor js=(JavascriptExecutor)driver;
             while (!js.executeScript("return document.readyState").toString().equals("complete")) {
                 Thread.sleep(100); // Check every 100ms
             }

             // End measuring time
             long endTime = System.currentTimeMillis();

             // Calculate load time
             long loadTime = endTime - startTime;
             System.out.println("IPO PAGE LOADED IN: " + loadTime + " ms");
         } catch (InterruptedException e) {
             System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
         }
    	
    	
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
    	Thread.sleep(2000);
    	Username.sendKeys("9075794960");
    }
    public void enterpass() throws InterruptedException {
    	Thread.sleep(2000);
    	Password.sendKeys("Vivek@91255");
    }
    public void loginbtn() {
    	loginbtn.click();
    }
    public void clkcontineus() throws InterruptedException {
    	
    	startTime = System.currentTimeMillis();
    	continuebtn.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    }
    public void OTPpagetitle() {
    	String verifytitle = title.getText();
    	System.out.println(verifytitle);
    }
    public String featchtitle() {
		String verifytitle =driver.getTitle();
		
		return verifytitle;

    }
    public void enterotp() {
    	otp.sendKeys("9");
    }
    public void homepage() {
    	startTime = System.currentTimeMillis();
    	String hometitle =driver.getTitle();
    	System.out.println(hometitle);
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    }
    //*********************************************************Home Page*******************************************************************

    
	@FindBy(xpath = "(//div[@class='total-card'])[2]")
	private WebElement equity;
    @FindBy(xpath = "//p[@class=\"total-amt mb-1\"]")
    private WebElement Asset;
    @FindBy(xpath = "(//div[@class='total-card'])[3]")
    private WebElement cash;
    @FindBy(xpath = "//div[@class='total-card ng-star-inserted']")
    private WebElement Mutual;
    @FindBy(xpath = "//div[@class='indices-box indian-indices-box ng-star-inserted']")
    private WebElement Keyindices;
    @FindBy(xpath = "//div[@class='indices-box global-indices-box']")
    private WebElement global;
    @FindBy(xpath = "(//div[@class='indices-box'])[1]")
    private WebElement FII;
    @FindBy(xpath = "//a[text()='Month']")
    private WebElement month;
    @FindBy(xpath = "//a[text()='Year']")
    private WebElement Year;
    @FindBy(xpath = "//div[@class='contain']")
    private WebElement refer;
    @FindBy(xpath = "(//div[@class='indices-box'])[2]")
    private WebElement gainer;
    @FindBy(xpath = "//p[text()='Market Movers']")
    private WebElement gettext;
    @FindBy(xpath = "//a[text()='Losers']")
    private WebElement losers;
    @FindBy(xpath = "//a[text()='Gainers']")
    private WebElement gainers;
    @FindBy(xpath = "(//a[text()='View All'])[4]")
    private WebElement ViewAll;
    @FindBy(xpath = "//div[@class='nse-bse ng-star-inserted']")
    private WebElement NSC_BSC;
    
    String initialData;
    String newData;
    
    
	public void equity() {
	    String equitydata =equity.getText();
	    System.out.println(equitydata);
	}
public void mover() {
		
	    String mover =gettext.getText();
	    System.out.println(mover);
	}
	public void Asset() {
		
	    String getassetdata =Asset.getText();
	    System.out.println(getassetdata);
	}
	public void Keyindices() {
	    String indiacesdata =Keyindices.getText();
	    System.out.println(indiacesdata);
	}
	public void cashdata() {
	    String indiacesdata =cash.getText();
	    System.out.println(indiacesdata);
	}
	public void mutualdata() {
	    String mutual =Mutual.getText();
	    System.out.println(mutual);
	}
	public void global() {
	    String globaldata =global.getText();
	    System.out.println(globaldata);
	}
	
	public void FII_DII() {
	    String Fii_Dii =FII.getText();
	    System.out.println(Fii_Dii);
	}
	public void MonthFII() throws InterruptedException {
		month.click();
		Thread.sleep(1000);
	    String Month =FII.getText();
	    System.out.println(Month);
	}
	public void YearFII() throws InterruptedException {
		Year.click();
		Thread.sleep(1000);
	    String Years =FII.getText();
	    System.out.println(Years);
	}
	public void Scrolling() {
		Jv.executeScript("window.scrollBy(0,1000)");
	}
	public void refer_eran() {
		String validaterefer =refer.getText();
		System.out.println(validaterefer);
		
	}
	
	public void moverdata() {
		String text=gainer.getText();
		System.out.println(text);
	}
	public void loser() {
		losers.click();
		 
	}
	public void ganerclick() {
		gainers.click();
	}
	public void viewAll() {
		ViewAll.click();
	}
	public void NSCBSC() {
	String 	NSC=NSC_BSC.getText();
	System.out.println(NSC);
	}
	public void writeDataToExcel(String string, String initialData2) throws InterruptedException {
		WebElement dataElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='indices-box'])[2]")));
		String	initialData = dataElement.getText();
	       writeDataToExcel("C:\\Users\\vivek.nityo\\git\\New folder\\MStock_Web\\datasheet.xlsx", initialData);
	       Thread.sleep(1000);
		
	}
	public void the_user_captures_the_new_data() throws InterruptedException {
        WebElement dataElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='indices-box'])[2]")));
        newData = dataElement.getText();
        writeDataToExcel("C:\\Users\\vivek.nityo\\git\\New folder\\MStock_Web\\datasheet.xlsx", newData);
    }

	 public void the_data_should_be_different() {
	        if (!initialData.equals(newData)) {
	            System.out.println("Test case passed: Data is different");
	        } else {
	            System.out.println("Test case failed: Data is the same");
	        }
	
	}
	 //************************************************* Portfolio ***************************************************
	 @FindBy(xpath="//a[@href='#/index/watchlist/Portfolio']")
	 private WebElement Portfolio;
	 @FindBy(xpath="//div[@class='total-asset']")
	 private WebElement TotalAsset;
	 @FindBy(xpath="(//p[@class='value'])[4]")
	 private WebElement Equity;
	 @FindBy(xpath="(//p[@class='value'])[5]")
	 private WebElement Dayspl;
	 @FindBy(xpath="(//p[@class='value'])[9]")
	 private WebElement MFPL;
	 @FindBy(xpath = ("//p[@style='text-align: right']"))
	 private WebElement DaysPLMF;
	 @FindBy(xpath = "//button[text()=' Add Funds ']")
	 private WebElement Addfund;
	 @FindBy(xpath = "//img[@id='logo']")
	 private WebElement logo;
	 @FindBy(xpath = "//img[@src='https://images.mstock.com/Web-images/Portfolio-Page-Banner/1.png']")
	 private WebElement BSE_F_and_O;
	 
	public void portfolio() {
		startTime = System.currentTimeMillis();
    	Portfolio.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    
	}
	public void  equity_overall_P_And_l(){
		 String equity =Equity.getText();
		 System.out.println(equity);
		 String DayspL=Dayspl.getText();
		 System.out.println(DayspL);
	}
	public void mutualFd() {
		String MFmpl =MFPL.getText();
		System.out.println(MFPL);
		String MF1=DaysPLMF.getText();
		System.out.println(MF1);
		
	}
	public void MFAddFundbutton() throws InterruptedException {
		Thread.sleep(1000);
		Addfund.click();
	}
	public void fundspage() { 
		String funds =Addfund.getText();
		System.out.println(funds);
	}
	public void totalAsset() {
		String total=TotalAsset.getText();
		System.out.println(total);
	}
	public void MiraeAssetlogo() {
		logo.click();
	}
	public void BSE_F_and_O() {
		BSE_F_and_O.click();
	}
	public String featchtitleBSE_F_and_O() {
		String verifytitle =driver.getTitle();
		
		return verifytitle;
} 
	public void Currenturl() {
		String verifyURL =driver.getCurrentUrl();
		System.out.println(verifyURL);
	}
	public void helpmainPage() throws InterruptedException {
		Thread.sleep(2000);
		//Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 
        // Switch to the new tab
        driver.switchTo().window(tabs.get(0));
        
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle() +"AND HELP PAGE OPEN SUCCESSFULLY");
		
	}
	 //************************************************* OMS ***************************************************
	
	@FindBy(xpath = "//a[text()='Watchlist']") private WebElement Watchlist;
	@FindBy(xpath = "//div[@class=\"watchlistcubes activeWatchlist ng-star-inserted\"]")
	private WebElement tooltip;
	@FindBy(xpath = "//tr[@class='watchlistExpandMatTableRow mat-row ng-star-inserted']")
	private WebElement Socklist;
	@FindBy(xpath = "//button[text()='Buy']") 
	private WebElement button;
	@FindBy(xpath = "//input[@onlynumber='true']") private WebElement Quantity;
	@FindBy(xpath = "//input[@id='mat-input-3']") private WebElement Price;
	@FindBy(xpath = "//button[text()='BUY']") private WebElement PopupBuy;
	
	
	
	public void Watchlisttab() {
		startTime = System.currentTimeMillis();
		Watchlist.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    
	}
	public void tooltip() {
		String WACHLIST =tooltip.getAttribute("WATCHLIST_1");
		System.out.println("Tooltip: "+WACHLIST);
		
	}
	public void MovesOver() throws InterruptedException {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(Socklist).perform();
		
	}
	public void Buybutton() {
		button.click();
	}
	public void EnterQuantity() {
		Quantity.sendKeys("2");
	}
	public void Enterprice() throws InterruptedException {
		Thread.sleep(1000);
		double minPrice = 188;
        double maxPrice = 229.77;
        double price = minPrice + (Math.random() * (maxPrice - minPrice));
        Price.sendKeys(String.valueOf(price));
	}
	public void popupbuy() {
		PopupBuy.click();
	}
	//****************************************************NSE DAY TREADE********************************************************
	@FindBy(xpath = "//div[text()=' DAY TRADE']") private WebElement producttype;
	
	public void ProductType() {
		producttype.click();
	}
	 //****************************************************BSE Invest********************************************************
	@FindBy(xpath = "//button[text()='BSE']") 
	private WebElement BSE;
	@FindBy(xpath = "//button[text()=' SELL']") 
	private WebElement Sell;
	@FindBy(xpath = "//button[@type='submit']") 
	private WebElement Submit;
	public void BSEInvest() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		BSE.click();
	}
	public void Sellbutton() throws InterruptedException {
		Sell.click();
		Thread.sleep(1000);
		Submit.click();
	}
	
	//****************************************************Verify the Recent Order********************************************************
	
	@FindBy(xpath = "//a[text()='Orders']")
	private WebElement Order;
	@FindBy(xpath = "//span[@class='g-l pointer']")
	private WebElement Executed;
	@FindBy(xpath = "(//*[@role=\"row\"])[2]")
	private WebElement currentOrder;
	@FindBy(xpath = "(//button[@class=\"seil\"])[2]")
	private WebElement Ordertrail;
	@FindBy(xpath = "//div[@class=\"details-container pb-3\"]") 
	private WebElement popup;
	@FindBy(xpath = "//*[@class=\"cross-btn\"]")
	private WebElement Crossbtn;
	
	public void Order() {
		Order.click();
		
	}
	public void Executed() {
		Executed.click();
	}
	public void currentorder() {
		currentOrder.click();
	}
	public void Ordertrail() {
		Ordertrail.click();
	}
	public void popup() throws InterruptedException {
		String verifytext=popup.getText();
		System.out.println(verifytext);
		Thread.sleep(1000);
		Crossbtn.click();
	}

	
	
	
	
	
	
	
}




