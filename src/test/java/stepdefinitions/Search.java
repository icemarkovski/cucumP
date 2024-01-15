package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import browsers.BrowsersType;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SearchPage;

public class Search {
	
	WebDriver driver;
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		
		driver = BrowsersType.webdriver();
		//SearchPage searchpage = new SearchPage(driver);
	    
	}

	@When("User enters valid product {string} into search box field")
	public void user_enters_valid_product_hp_into_search_box_field(String validProduct) {
		
		SearchPage searchpage = new SearchPage(driver);
		searchpage.entervalidproduct(validProduct);
	    
		//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(validProduct);
		
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
		
		SearchPage searchpage = new SearchPage(driver);
		searchpage.clicksonsearchbutton();
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	    
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		
		SearchPage searchpage = new SearchPage(driver);
		
		Assert.assertTrue(searchpage.displayingmessagge());
		//Assert.assertFalse(true); to fail method
		
	//	Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")).isDisplayed());
	
	}

	@When("User enters invalid product {string} into search box field")
	public void user_enters_invalid_product_honda_into_search_box_field(String invalidProduct) {
		
		SearchPage searchpage = new SearchPage(driver);
		
		searchpage.invalidproduct(invalidProduct);
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(invalidProcuct);

	    
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
		
		SearchPage searchpage = new SearchPage(driver);
		//??
		searchpage.message();
		
		//Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).isDisplayed());
	    
	}

	@When("User dont provid any product name into Search box field")
	public void user_dont_provid_any_product_name_into_search_box_field() {
		
		SearchPage searchpage = new SearchPage(driver);
		
		searchpage.dontprovideproduct();
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	    
	}

}
