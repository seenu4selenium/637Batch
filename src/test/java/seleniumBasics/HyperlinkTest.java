package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class HyperlinkTest {
	WebDriver driver;

	@Test
	public void fbHyperLink() {
		// driver = new ChromeDriver();
		// driver = new EdgeDriver();
		driver = new FirefoxDriver();
		// driver = new SafariDriver();
		driver.get("https://www.facebook.com/");
		// Click on Hyper link
		driver.findElement(By.linkText("Forgot password?")).click();

	}

	@Test
	public void googleImages() {
		// Open google page
		driver.get("https://google.com/");
		driver.findElement(By.linkText("images")).click();
	}
}
