package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		//Create an object for Webdriver interface
		
		
		// Open Chrome browser	
		driver = new ChromeDriver();	
		
		//Type URL (fb)
		driver.get("https://www.facebook.com/");
				
		//Type invalid UN & Passwd
		//Object identify>>do action
		
		
		sendKeysByAnyLocator(By.id("email"), "765fggh87Hiall@gmail.com");
		sendKeysByAnyLocator(By.name("pass"), "sdjbgdskgbd");
		
		//driver.findElement(By.id("email")).sendKeys("765fggh87Hiall@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("sdjbgdskgbd");
		
		//click on Login button
		driver.findElement(By.name("login")).click();
		
	}
	//Create a Re-usable Method	
	public static void sendKeysByAnyLocator(By locator, String inputdata) throws Exception {
		WebElement element = driver.findElement(locator);
		// Check your locator is displayed?
		if (driver.findElements(locator).size() > 0) {
			// Check your element is in enable state?
			if (element.isEnabled()) {
				System.out.println("Given locator is enable state ***");
				// Clear any existing data
				element.clear();
				// Send the test data to Edit box			
				element.sendKeys(inputdata);
			} else {
				System.out.println("Given locator is not enable state on DOM(Current page***");
			}
		} else {
			System.out.println("Given locator is not displayed on DOM(Current page***");
		}
	}

}
