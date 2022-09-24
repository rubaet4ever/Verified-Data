package verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.ProtocolHandshake;

public class SeleniumTestManager {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//
		
		final String SERVER_URL = "https://demo.zeuz.ai/web/level/one/actions/save_text";
		
		 
		WebDriver driver = getChromeDriver(SERVER_URL); 
		ChromeOptions chromeOptions = new ChromeOptions();	
		
		VerifiedText.clickVerifiedText(driver);
	}
	

	
	
	private static WebDriver getChromeDriver(String serverUrl) {
		
		
		
		final String DRIVER_NAME = "webdriver.chrome.driver";
		final String DRIVER_URL =  "F:\\My Work\\Work Tools\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty(DRIVER_NAME, DRIVER_URL);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(serverUrl);
	    

	return driver;
}

}
