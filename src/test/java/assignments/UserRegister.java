package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class UserRegister {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://tirupatibalaji.ap.gov.in/#/login");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.linkText("Sign Up")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("individual")).click();
	  
	  
	  driver.findElement(By.name("fName")).sendKeys("Maya");
	  
	  
	  driver.findElement(By.name("lName")).sendKeys("K");
	  
	  
	  driver.findElement(By.name("mobNo")).sendKeys("987654566");
	  
	  
	  driver.findElement(By.id("regdob")).click();
	  
	  Thread.sleep(1000);
	  
	  
	  driver.findElement(By.className("gender")).click();
	  
	  
	  driver.findElement(By.name("address1")).sendKeys("xyz");
	  
	  
	  driver.findElement(By.name("address2")).sendKeys("xyz");
	  
	  
	  driver.findElement(By.name("cityS")).sendKeys("Bangalore");
	  
	  driver.findElement(By.name("zipCode")).sendKeys("12345");
	  
	  
	  //photoid
	  
	  driver.findElement(By.name("proofId")).sendKeys("abc");
	  
	  //username
	  
	  driver.findElement(By.name("emailId")).sendKeys("abc@gmail.com");
	  
	  //create password
	  
	  driver.findElement(By.name("password")).sendKeys("star");
	  
	  //confirm password
	  
	  driver.findElement(By.name("repassword")).sendKeys("star");
	  
	  //captcha//
	  
	  
	  driver.findElement(By.id("repassword")).sendKeys("ghkl");
	  
	  
	  driver.findElement(By.id("txtInput")).sendKeys("rose");
	  
		
  }


}

	  
	  
	  
	
	  
	  
	  
	  
	  

	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  

	  
	  
	  
	   
	  
	  
	  
	  
	  
	  
	  
	  
		  
