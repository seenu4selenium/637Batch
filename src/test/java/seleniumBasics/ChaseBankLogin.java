package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChaseBankLogin {
	public static 	WebDriver driver;
	public static void main(String[] args)throws Exception  {
		driver = new ChromeDriver();
		
		driver.get("https://www.chase.com/");
		//Wait for 5 sescond
		Thread.sleep(8000);
		loopAllFramesForElement(By.xpath("//*[@id=\"userId-text-input-field\"]"));
		driver.findElement(By.xpath("//*[@id=\"userId-text-input-field\"]")).sendKeys("test123");
		driver.findElement(By.id("password-text-input-field")).sendKeys("sdgidsgkj");
		driver.findElement(By.id("signin-button")).click();
	}

	
	public static int iframeCount() {
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());//3
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		return numberOfFrames;
	}

	public static void switchToFrameByInt(int i) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(i);
	}

	public static int loopAllFramesForElement(By locator) {

		int elementpresenceCount = 0;
		int loop = 0;
		int maxFramaecount = iframeCount();// 3
		// if given locater has present on webpage, then the element size would be '1'
		// else '0'
		elementpresenceCount = driver.findElements(locator).size();// 0
		while (elementpresenceCount == 0 && loop < maxFramaecount) {
			try {
				switchToFrameByInt(loop);
				elementpresenceCount = driver.findElements(locator).size();// 1
				System.out.println("Try LoopAllframesAndReturnWebEL : " + loop + "; ElementpresenceCount: "
						+ elementpresenceCount);
				if (elementpresenceCount > 0 || loop > maxFramaecount) {
					break;
				}
			} catch (Exception ex) {
				System.out.println("Catch LoopAllframesAndReturnWebEL Old: " + loop + "; " + ex);
			}
			loop++;// 1
		}
		return elementpresenceCount;
	}
	
}
