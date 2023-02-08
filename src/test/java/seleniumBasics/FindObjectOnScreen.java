package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindObjectOnScreen {
	@Test
	public void f() throws Exception {
		// Find the Firstname Editbox is displayed or not?
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(3000);
		// Without fill any data, click on Submit button
		driver.findElement(By.id("submit")).click();

		// Verify the Firstname error message has displayed or not?
		String fNErrMsg = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(fNErrMsg);

		// Find locator is displayed
		if (driver.findElements(By.id("firstName")).size() > 0) {
			System.out.println("Given locator is displayed on screen,******");

			// Check Firstname is Enabled or not?
			if (driver.findElement(By.id("firstName")).isEnabled()) {
				System.out.println("Given locator is Enabled on screen,******");
				// Clear the existing data
				driver.findElement(By.id("firstName")).clear();
				driver.findElement(By.id("firstName")).sendKeys("ABC");
			}

		} else {
			System.out.println("Given locator is NOT displayed on screen,Check the locator");
		}

	}
}
