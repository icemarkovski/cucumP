package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Constants;
import utils.ElementUtils;

public class HomePage {
	
		WebDriver driver; //global
		
		ElementUtils elementutils; //global
		
		public HomePage(WebDriver driver) {//constructor
			
			this.driver = driver;
			PageFactory.initElements(driver, this);//predefined class
			
			elementutils = new ElementUtils(driver);//ElementUtils file
			
		}
		
		//1
		@FindBy(xpath="//i[@class='fa fa-user']")
		private WebElement MyAccountDropMenu;
		
		//2
		@FindBy(xpath="//a[normalize-space()='Login']")
		private WebElement LoginOption;
		
		//3
		@FindBy(xpath="//a[normalize-space()='Register']")
		private WebElement Register;
			
		public void clickOnMyAccount() {
			
			//MyAccountDropMenu.click();
			
			elementutils.clickOnElement(MyAccountDropMenu, Constants.EXPLICIT_WAIT_BASIC_TIME);
			
			}	

		public void LoginOption() {
			
			//LoginOption.click();
			
			elementutils.clickOnElement(LoginOption, Constants.EXPLICIT_WAIT_BASIC_TIME);
			
		}
		
		public void RegisterOption() {
			
			//Register.click();
			
			elementutils.clickOnElement(Register, Constants.EXPLICIT_WAIT_BASIC_TIME);
		}
		
	}
