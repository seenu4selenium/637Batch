package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) {
		//Create an object for Webdriver interface
		WebDriver driver;
		
		// Open Chrome browser	
		driver = new ChromeDriver();	
		
		//Type URL (fb)
		driver.get("https://www.facebook.com/");
				
		//Type invalid UN & Passwd
		//Object identify>>do action
		driver.findElement(By.id("email")).sendKeys("765fggh87Hiall@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdjbgdskgbd");
		
		//click on Login button
		driver.findElement(By.name("login")).click();
		
	}

}
