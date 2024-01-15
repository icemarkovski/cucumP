package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Constants;
import utils.ElementUtils;

public class LoginPage {
	
	WebDriver driver; //global
	
	ElementUtils elementutils; //global/ from ElementUtils file
	
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		elementutils = new ElementUtils(driver);
		
	}
		//1
		@FindBy(css="#input-email")
		private WebElement UserName;
		
		//2
		@FindBy(xpath="//*[@id=\"input-password\"]")
		private WebElement Password;
		
		//3
		@FindBy(xpath="//input[@value='Login']")
		public WebElement loginButtonClick;
		
		//4
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
		private WebElement warningMessage;
	
		//-----------------------------------------------------
		
		//1
		public void enterEmail(String email) {
			
			//UserName.sendKeys(email);
			
			elementutils.typeTextIntoElement(UserName, email, Constants.EXPLICIT_WAIT_BASIC_TIME);
			
		}
		//2
		public void enterPassword(String password) {
			
			//Password.sendKeys(password);
			
			elementutils.typeTextIntoElement(Password, password, Constants.EXPLICIT_WAIT_BASIC_TIME);
			
			
		}
		
		//@FindBy(xpath="//*[@id=\\\"content\\\"]/div/div[2]/div/form/input")
		//private WebElement loginButtonClick123;
		//3
		public void clickOnLoginButton() {
			
			//loginButtonClick.click();
			
			elementutils.clickOnElement(loginButtonClick,Constants.EXPLICIT_WAIT_BASIC_TIME);
		}
	
		
		//4
		public String displayingWarningMessage() {
			
			return elementutils.getTextFromElement(warningMessage, Constants.EXPLICIT_WAIT_BASIC_TIME);
			
	//	return warningMessage.getText();
	//	warningMessage.getText("Warning: No match for E-Mail Address and/or Password.");	
	

	}

}
