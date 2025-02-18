package MStockStep;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Page_Object_Modul.MStock_Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;

public class Mstock_login_Step 
{
	MStock_Login_page MStocklogin = new MStock_Login_page(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	List<WebElement> links;
	//String URL = "https://trade.mstock.com/#/";
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		MStocklogin.launchurl();
	}

	@When("the user enters username and password")
	public void the_user_enters_username_and_password() throws InterruptedException {
		MStocklogin.enterpass();
		MStocklogin.enterusername();
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
		MStocklogin.enterpass();
	}

	@Then("the user should be Redirect on OTP page")
	public void the_user_should_be_redirect_on_otp_page() {
	   MStocklogin.loginbtn();
	}

	@Then("the user is able to see the 2FA Security page.")
	public void the_user_is_able_to_see_the_2fa_security_page() {
	    MStocklogin.OTPpagetitle();
	}

	@When("the User Entering the OTP in Input field")
	public void the_user_entering_the_otp_in_input_field() throws InterruptedException {
//		Thread.sleep(1000);
	 // MStocklogin.enterotp();
	}

	@Then("the Risk Discloures page Should be open and able to click on continue button")
	public void the_risk_discloures_page_should_be_open_and_able_to_click_on_continue_button() throws InterruptedException {
//		Thread.sleep(1000);
//		MStocklogin.featchtitle();
		Thread.sleep(20000);
	  MStocklogin.clkcontineus();
	}
	
	@Then("User Should be redirect on Landing page")
	public void user_should_be_redirect_on_landing_page() {
	  String titleHome =driver.getTitle();
	  System.out.println(titleHome);
	}
	 //*********************************************************Home Page*******************************************************************

	@When("the User check the {string} on home page")
	public void the_user_check_the_on_home_page(String string) throws InterruptedException {
		Thread.sleep(1000);
	  MStocklogin.Asset();
	}

	@When("To verify User is able to see the amount of  Equity")
	public void to_verify_user_is_able_to_see_the_amount_of_equity() {
	    MStocklogin.equity();
	}

	@When("To verify User is able to see the amount of  Mutual Fund")
	public void to_verify_user_is_able_to_see_the_amount_of_mutual_fund() {
	   MStocklogin.mutualdata();
	}

	@When("To verify User is able to see the amount of  Cash")
	public void to_verify_user_is_able_to_see_the_amount_of_cash() {
		MStocklogin.cashdata();
		  // MStocklogin.Scrolling();
	}

	@Then("To verify the {string}")
	public void to_verify_the(String string) {
	  MStocklogin.Keyindices();
	}

	@Then("To verify Global indices")
	public void to_verify_global_indices() {
	   MStocklogin.global();
	}

	@Then("To varify the FII\\/DII data fetch yesterday data")
	public void to_varify_the_fii_dii_data_fetch_yesterday_data() {
	   MStocklogin.FII_DII();
	}

	@When("The user click on month and Validate the data")
	public void the_user_click_on_month_and_validate_the_data() throws InterruptedException {
	  MStocklogin.MonthFII();
	}

	@When("The User click on Year and featch the data")
	public void the_user_click_on_year_and_featch_the_data() throws InterruptedException {
	    MStocklogin.YearFII();
	}

	@Then("verify the refer and Earn")
	public void verify_the_refer_and_earn() throws InterruptedException {
	 //  MStocklogin.Scrolling();
	   MStocklogin.refer_eran();
	   Thread.sleep(1000);
	  // MStocklogin.Scrolling();
	   MStocklogin.mover();
	}

	@When("To verify User is able to see the {string}  in which is able to see the {string} And {string} below to Market Movers")
	public void to_verify_user_is_able_to_see_the_in_which_is_able_to_see_the_and_below_to_market_movers(String string, String string2, String string3) throws InterruptedException {
	MStocklogin.moverdata();
	MStocklogin.loser();
	Thread.sleep(1000);
	MStocklogin.moverdata();
	Thread.sleep(1000);
	MStocklogin.ganerclick();
	Thread.sleep(1000);
	MStocklogin.moverdata();
	
//	MStocklogin.writeDataToExcel(string2, string3);
//	MStocklogin.the_user_captures_the_new_data();
//	MStocklogin.the_data_should_be_different();
	
	}
	@When("To verify User is able to see the {string} besides {string} CTA and it is clickable")
	public void to_verify_user_is_able_to_see_the_besides_cta_and_it_is_clickable(String string, String string2) {
	   MStocklogin.viewAll();
	}

	@Then("The CTA page Should be Open")
	public void the_cta_page_should_be_open() {
	    MStocklogin.NSCBSC();
	}
	
	//************************************************* Portpolio***************************************************
	@When("To verify User is able to see  and click on the \"Portfolio \"Tab beside to {string} Tab")
	public void to_verify_user_is_able_to_see_and_click_on_the_portfolio_tab_beside_to_tab(String string) {
		MStocklogin.portfolio();
	}

	@Then("To verify User is able to see the amount of  Total Assets")
	public void to_verify_user_is_able_to_see_the_amount_of_total_assets() {
		MStocklogin.totalAsset();
	  
	}

	@Then("To verify User is able to see the amount of  Overall Profit\\/Loss")
	public void to_verify_user_is_able_to_see_the_amount_of_overall_profit_loss() {
		 MStocklogin.equity_overall_P_And_l();
	 
	}

	@Then("To verify User is able to see the amount of  {string}")
	public void to_verify_user_is_able_to_see_the_amount_of(String string) {
		 MStocklogin.mutualFd();
	    
	}

	@When("To verify User is able to see the {string} CTA below to  {string} and it should be clickable")
	public void to_verify_user_is_able_to_see_the_cta_below_to_and_it_should_be_clickable(String string, String string2) throws InterruptedException {
		MStocklogin.MFAddFundbutton();
	}

	@Then("To verify User is able to see the {string} CTA  beside to Available cash and is clickable")
	public void to_verify_user_is_able_to_see_the_cta_beside_to_available_cash_and_is_clickable(String string) {
		 MStocklogin.fundspage();
	}

	@When("To verify User is able to see the Text  {string} and is clickable")
	public void to_verify_user_is_able_to_see_the_text_and_is_clickable(String string) throws InterruptedException {
	  MStocklogin.MiraeAssetlogo();
	  MStocklogin.portfolio();
	  Thread.sleep(1000);
	  MStocklogin.BSE_F_and_O();
	  MStocklogin.featchtitleBSE_F_and_O();
	  Thread.sleep(1000);
	  MStocklogin.Currenturl();
	}
}
