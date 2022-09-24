package verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifiedText {
	
	public static void clickVerifiedText(WebDriver driver) {
		try {
			Thread.sleep(2000);
			String OI = driver.findElement(By.id("randomText")).getText();
			System.out.print(OI);		
	
			driver.findElement(By.id("enter_text")).sendKeys(OI);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#verify_id")).click();
			Thread.sleep(2000);
			
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

}
