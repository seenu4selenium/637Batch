package assignments;

//ASSIGNMENT 6----6.2//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class College1 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  driver =new ChromeDriver();
	  
	  driver.get("https://collegeweeklive.com/go-signup/");
	  
	  Thread.sleep(1000);
	  
	  Select am =new Select(driver.findElement(By.name("attendeeType"))); am.selectByVisibleText("Student Looking for Graduate Degree");
	  	 	  
	  
	  
  }
}

