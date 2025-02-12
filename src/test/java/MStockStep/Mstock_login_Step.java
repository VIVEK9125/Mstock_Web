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
	  MStocklogin.enterusername();
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		MStocklogin.enterpass();
	}

	@Then("the user should be Redirect on OTP page")
	public void the_user_should_be_redirect_on_otp_page() {
	   MStocklogin.loginbtn();
	}

	@Then("the user is able to see the 2FA Security page.")
	public void the_user_is_able_to_see_the_2fa_security_page() {
	    
	}

	@When("the User Entering the OTP in Input field")
	public void the_user_entering_the_otp_in_input_field() {
	  
	}

	@Then("the Risk Discloures page Should be open and able to click on continue button")
	public void the_risk_discloures_page_should_be_open_and_able_to_click_on_continue_button() {
	  
	}
	
	@Then("User Should be redirect on Landing page")
	public void user_should_be_redirect_on_landing_page() {
	  
	}

}
