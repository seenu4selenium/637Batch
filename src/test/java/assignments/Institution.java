package assignments;


//ASSIGNMENT-5//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Institution {
  @Test
  public void f() throws InterruptedException {
	  
WebDriver driver;
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://tirupatibalaji.ap.gov.in/#/login");
	  
	 Thread.sleep(1000);
	  
	  driver.findElement(By.linkText("Sign Up")).click();
	  
	 Thread.sleep(3000);
	  
	  driver.findElement(By.id("entity")).click();
	  
	  driver.findElement(By.name("name")).sendKeys("MKS");
	  
	
	  
  }
}


