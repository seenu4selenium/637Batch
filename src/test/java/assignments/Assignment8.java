package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String args[]) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		if (driver.findElement(By.id("yesRadio")).isSelected()) {
			System.out.println("yes radio button is selected");
		} else {
			System.out.println("yes radio button is not selected");
		}

		if (driver.findElement(By.id("noRadio")).isEnabled()) {
			System.out.println("noRadio button is enabled");

		} else {
			System.out.println("noRadio button is not enabled");
		}
	}

}
