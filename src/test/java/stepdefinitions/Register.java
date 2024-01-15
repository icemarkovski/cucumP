package stepdefinitions;

import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import browsers.BrowsersType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.HomePage;
import pages.RegisterPage;

public class Register {
	
		WebDriver driver;
	
	@Given("User navigates to Register account page")
	public void user_navigates_to_register_account_page() {
		
		driver = BrowsersType.webdriver();
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();
		homepage.RegisterOption();
		//driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	   
	}

	@When("User enters only mandatory fields")
	public void user_enters_only_mandatory_fields(DataTable dataTable) {
		
		Map<String, String> map = dataTable.asMap(String.class,String.class);

		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.name(map.get("firstName"));
		registerpage.lastname(map.get("lastName"));
		registerpage.enteremail(dati());
		registerpage.telNum(map.get("Telephone"));
		registerpage.Pass1(map.get("Password"));
		registerpage.confirmpassword(map.get("confirmPass"));
		
		//Map<String, String> map = dataTable.asMap(String.class,String.class);
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(map.get("firstName"));
		//driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(map.get("lastName"));
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(dati());
	    //driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys(map.get("Telephone"));
	    //driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(map.get("Password"));
	   // driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys(map.get("confirmPass"));
	    
	}
	
	@When("User enters only mandatory fields duplicate account")
	public void user_enters_only_mandatory_fields_duplicate_accounts(DataTable dataTable) {
		
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.name(map.get("firstName"));
		registerpage.lastname(map.get("lastName"));
		registerpage.enteremail(map.get("email"));
		registerpage.telNum(map.get("Telephone"));
		registerpage.Pass1(map.get("Password"));
		registerpage.confirmpassword(map.get("confirmPass"));
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(map.get("firstName"));
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(map.get("lastName"));
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(map.get("email"));
//	    driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys(map.get("Telephone"));
//	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(map.get("Password"));
//	    driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys(map.get("confirmPass"));
	    
	}
	
	@And("User select Privacy Policy")
	public void user_select_privacy_policy() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.prypol();
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
	    
	}

	@And("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.continuebutton();
		
		
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	   
	}

	@SuppressWarnings("deprecation")
	@Then("User account should create successfully")
	public void user_account_should_create_successfully() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		//registerpage.accountcreated();
		
		//String act = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(registerpage.accountcreated().contains("Congratulations! Your new account has been successfully created!"));
		
		//Assert.assertEquals(act,registerpage.accountcreated());
		
	}

	@And("User selects Yes for newsletter")
	public void user_selects_yes_for_newsletter() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.subscribenews();
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]")).click();
	    
	}

	@SuppressWarnings("deprecation")
	@Then("User should get propper warning message about duplicate email")
	public void user_should_get_propper_warning_message_about_duplicate_email() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		
		//String act = driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).getText();
	    String exp = "Warning: E-Mail Address is already registered!";
	    Assert.assertEquals(registerpage.duplicateemail(), exp);
		
	}

	@When("User dont enter any details into manfdatory fields")
	public void user_dont_enter_any_details_into_manfdatory_fields() {
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	   
	}

	@SuppressWarnings("deprecation")
	@Then("User should get propper warning message for any mandatory field")
	public void user_should_get_propper_warning_message_for_any_mandatory_field() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		
		Assert.assertTrue(registerpage.privacypolicy().contains("Warning: You must agree to the Privacy Policy!"));
	    
		Assert.assertTrue(registerpage.firstnamemessage().contains("First Name must be between 1 and 32 characters!"));
		
		Assert.assertTrue(registerpage.lastnamemessage().contains("Last Name must be between 1 and 32 characters!"));
		
		Assert.assertTrue(registerpage.emailmessage().contains("E-Mail Address does not appear to be valid!"));

		Assert.assertTrue(registerpage.telephonemessage().contains("Telephone must be between 3 and 32 characters!"));
		
		Assert.assertTrue(registerpage.passwordlong().contains("Password must be between 4 and 20 characters!"));

	}

public String dati() {
		
		Date time = new Date();
		
		return "ice"+time.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
		
	}

}
