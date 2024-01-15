package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersType {
	
	static WebDriver driver = null;
	
	public static void browsName(String browserName) {
		
		if(browserName.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equals("edge")) {
			
			driver = new EdgeDriver();
			
			}
		
		
		
	}
	
	public static WebDriver webdriver() {
		
		return driver;
		
	}
	
}
