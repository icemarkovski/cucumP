package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browsers.BrowsersType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.Constants;

public class Cucumberhooks {
	
		WebDriver driver;
	
	@Before
	public void bef() throws Exception {
		
		Properties prop = ConfigReader.initializeProperties();
		BrowsersType.browsName(prop.getProperty("browser"));
		driver = BrowsersType.webdriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIME));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICITLY_WAIT_TIME));
		driver.get(prop.getProperty("url"));
		
	}
	
	@After
	public void aft(Scenario scenario) {
		
	
		String name = scenario.getName().replace(" ", "_");
		
		if(scenario.isFailed()) {
			
		 byte[] screeen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 scenario.attach(screeen, "image/png", name);
			 
			 
		}
		
		driver.quit();
		
		
	}

}
