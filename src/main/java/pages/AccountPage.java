package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Constants;
import utils.ElementUtils;

public class AccountPage {
	
	WebDriver driver;//global
	
	ElementUtils elementutils;//global/from ElementUtils file
	
	public AccountPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		elementutils = new ElementUtils(driver);
		
	}
	//1
	@FindBy(xpath="//a[normalize-space()='Edit your account information']")
	private WebElement loginSuccess;
	
	//1
	public boolean successLogin() {
		
		return elementutils.displayStatusOfElement(loginSuccess, Constants.EXPLICIT_WAIT_BASIC_TIME);
		//return loginSuccess.isDisplayed();
		
	}

}
