package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RechargeIT {
	
  @Test
  
  public void f() {
	
	  WebDriver driver;
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.justrechargeit.com/");
	  
	  driver.findElement(By.linkText("Sign in")).click();  
	  
	  driver.findElement(By.id("txtUserName")).sendKeys("xyz@gmail.com");
	  
	  driver.findElement(By.name("txtPasswd")).sendKeys("123");
	  
	  driver.findElement(By.id("txtCaptcha")).sendKeys("40");
	  
	  driver.findElement(By.name("imgbtnSignin")).click();
  	  	 		
	 
  }
}



