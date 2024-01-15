package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class SearchPage {
	
	WebDriver driver;  //global
	
	ElementUtils elementutils;  //global/From ElementUtilsFile;
	
	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		elementutils = new ElementUtils(driver);
		
	}
	//1
	@FindBy(xpath="//*[@id='search']/input")
	private  WebElement  entervp;
	//2
	@FindBy(xpath="//*[@id='search']/span/button")
	private WebElement clonse;
	
	@FindBy(xpath="//*[@id='content']/div[3]/div/div/div[1]/a/img")
	private WebElement dispmess;
	
	@FindBy(xpath="//*[@id='search']/input")
	private WebElement inpr;
	
	@FindBy(xpath="//*[@id='content']/h2")
	private WebElement mess;
	
	@FindBy(xpath="//*[@id='search']/span/button")
	private WebElement doprpr;
	
	//-----------------------------------------------
	
	public void entervalidproduct(String validProduct) {
		
		//entervp.sendKeys(validProduct);
		
		elementutils.typeTextIntoElement(entervp, validProduct, 30);
	}
	//2
	public void clicksonsearchbutton() {
		
		//clonse.click();
		
		elementutils.clickOnElement(clonse, 30);
		
	}
	
	public boolean displayingmessagge() {
		
		return dispmess.isDisplayed();
	}
	
	public void invalidproduct(String invalidProduct) {
		
		inpr.sendKeys(invalidProduct);
	}
	
	public void message() {
		
		mess.isDisplayed();
		
		
	}
	
	public void dontprovideproduct() {
		
		
		doprpr.click();
	}
	
}
