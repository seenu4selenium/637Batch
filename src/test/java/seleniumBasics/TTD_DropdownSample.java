package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TTD_DropdownSample {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		// Wait for few second
		Thread.sleep(5000);

		//new Select(driver.findElement(By.name("proofS"))).selectByVisibleText("PAN Card");
//		new Select(driver.findElement(By.name("proofS"))).selectByIndex(4);
		
		for (int i = 1; i <=6; i++) {
			new Select(driver.findElement(By.name("proofS"))).selectByIndex(i);
			Thread.sleep(2000);
						

		}
		
		
	}
}
