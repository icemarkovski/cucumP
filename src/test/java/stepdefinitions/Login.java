package stepdefinitions;

import java.time.Duration;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import browsers.BrowsersType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login {
	
	WebDriver driver;
	
//1st scenario-----------------------------------------------------------------------------
	
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
		
		driver = BrowsersType.webdriver();
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();
		homepage.LoginOption();
			
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String email) {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmail(email);
		
	  // Assert.assertFalse(true);
	   
	//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
		
	}
	
	@And("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterPassword(password);
		
		//driver.findElement(By.xpath("//*[@id=\\\"input-email\\\"]")).sendKeys(password);
	    
	}
	
	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickOnLoginButton();
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
	}
	
	@Then("User should successfully Login")
	public void user_should_successfully_login() {
		
		AccountPage accountpage = new AccountPage(driver);
		
		//accountpage.successLogin();
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a")).getText().equals("Edit your account information");
	   //Assert.assertTrue(accountpage.successLogin().contains("Edit your account information"));
		//assertTrue is from JUnit
	  // Assert.assertEquals(accountpage.successLogin().isDisplayed();
	   
	  // driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']")).isDisplayed();
	}
	
//2nd scenario------------------------------------------------------------------------------
	
	@When("User enters invalid email address into email field")
	public void user_enters_invalid_email_address_into_email_field() {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmail(dati());
		
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(dati());
	   
	}
	
	@And("User enter invalid password {string} into password field")
	public void user_enter_invalid_password_into_password_field(String invallidPassword) {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterPassword(invallidPassword);
	   
		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(invallidPassword);
		
	}
	
	@Then("User should get propper warning message about credentials missmatch")
	public void user_should_get_propper_warning_message_about_credentials_missmatch() {
		
		LoginPage loginpage = new LoginPage(driver);
		//Assert.assertTrue(loginpage.displayingWarningMessage().contains("Warning: No match for E-Mail Address and/or Password."));
		
		driver.findElement(By.xpath("//*[@id='account-login']/div[1]")).getText().equals("Warning: No match for E-Mail Address and/or Password.");
	   //Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password."));

	}
	
	@When("User not provide any credentials")
	public void user_not_provide_any_credentials() {
		

		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterEmail("");
		loginpage.enterPassword("");
		//loginpage.loginButtonClick.click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("");
		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

	    
	}
	
	public String dati() {
		
		Date time = new Date();
		
		return "ice"+time.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
		
		
		}
	

}
