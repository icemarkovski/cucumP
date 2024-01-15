package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Constants;
import utils.ElementUtils;

public class RegisterPage {
	
	WebDriver driver;//global
	
	ElementUtils elementutils;//global/from ElementUtils file
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;//WebDriver
		
		PageFactory.initElements(driver, this);//class
		
		elementutils = new ElementUtils(driver);
		
	}
	//1
	//first name
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement enterFirstName;
	
	//last name
	//2
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement last;
	
	//3
	@FindBy(xpath="//*[@id='input-email']")
	private WebElement email11;
	
	//4
	@FindBy(xpath="//*[@id='input-telephone']")
	private WebElement tel;
	
	//5
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement pass;
	
	//6
	@FindBy(xpath="//*[@id='input-confirm']")
	private WebElement conpas;
	
	//7
	@FindBy(xpath="//*[@id='content']/form/div/div/input[1]")
	private WebElement pp;
	
	//8
	@FindBy(xpath="//*[@id='content']/form/div/div/input[2]")
	private WebElement conbut;
	
	//9
	@FindBy(xpath="//p[contains(text(),'Congratulations! Your new account has been success')]")
	private WebElement acccre;
	
	//10
	@FindBy(xpath="//*[@id='content']/form/fieldset[3]/div/div/label[1]")
	private WebElement subs;
	
	//11
	@FindBy(xpath="//*[@id='account-register']/div[1]")
	private WebElement dupema;
	
	//--------------------------------
	//12
	@FindBy(xpath="//*[@id='account-register']/div[1]")
	private WebElement pripol ;
	
	//13
	@FindBy(xpath="//*[@id='account']/div[2]/div/div")
	private WebElement fnamemess  ;
	
	//14
	@FindBy(xpath="//*[@id='account']/div[3]/div/div")
	private WebElement  lnamemess;
	
	//15
	@FindBy(xpath="//*[@id='account']/div[4]/div/div")
	private WebElement em  ;
	
	//16
	@FindBy(xpath="//*[@id='account']/div[5]/div/div")
	private WebElement tele ;
	
	//17
	@FindBy(xpath="//*[@id='content']/form/fieldset[2]/div[1]/div/div")
	private WebElement  passlong;
	
	//--------------------------------------------------------------
	//1
	public void name(String firstName) {
		
		elementutils.typeTextIntoElement(enterFirstName,firstName,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//enterFirstName.sendKeys(firstName);
		
	}
		
	public void lastname(String lastName) {
		
		elementutils.typeTextIntoElement(last,lastName,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//last.sendKeys(lastName);
		
	}
	//3
	public void enteremail(String email) {
		
		elementutils.typeTextIntoElement(email11,email,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//email11.sendKeys(email);
		
	}
	//4
	public void telNum(String Telephone) {
		
		elementutils.typeTextIntoElement(tel,Telephone,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//tel.sendKeys(Telephone);
		
		
	}
	//5
	public void Pass1(String Password) {
		
		elementutils.typeTextIntoElement(pass,Password,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//pass.sendKeys(Password);
		
	}
	//6
	public void confirmpassword(String confirmPass) {
		
		elementutils.typeTextIntoElement(conpas,confirmPass,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//conpas.sendKeys(confirmPass);
	}
	//7
	public void prypol() {
		
		elementutils.clickOnElement(pp, Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//pp.click();
		
	}
	//8
	public void continuebutton() {
		
		elementutils.clickOnElement(conbut, Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//conbut.click();
		
	}
	//9
	public String accountcreated() {
		
		 return elementutils.getTextFromElement(acccre,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//return acccre.getText();
		
	}
	//10
	public void subscribenews() {
		
		elementutils.clickOnElement(subs, Constants.EXPLICIT_WAIT_BASIC_TIME);
		//subs.click();
		
	}
	//11
	public String duplicateemail() {
		
		return elementutils.getTextFromElement(dupema,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//return dupema.getText();
	}
	
	//------------------
	//12
	public String privacypolicy() {
		
		return elementutils.getTextFromElement(pripol,Constants.EXPLICIT_WAIT_BASIC_TIME);

		//return pripol.getText();
		
	}
	//13
	public String firstnamemessage() {
		
		return elementutils.getTextFromElement(fnamemess,Constants.EXPLICIT_WAIT_BASIC_TIME);
	
	//return fnamemess.getText();
	
	}
	//14
	public String lastnamemessage() {
		
		return elementutils.getTextFromElement(lnamemess,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
	//return lnamemess.getText();
	
	}
	//15
	public String emailmessage() {
		
		//return em.getText();
		
		return elementutils.getTextFromElement(em,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		}
	//16
	public String telephonemessage()  {
		
		return elementutils.getTextFromElement(tele,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//return tele.getText();
		
		}
	
	//17
	public String passwordlong() {
		
		return elementutils.getTextFromElement(passlong,Constants.EXPLICIT_WAIT_BASIC_TIME);
		
		//return passlong.getText();
		
		}
	}
