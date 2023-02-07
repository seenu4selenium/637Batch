package assignments;


//ASSIGNMENT---6(6.3)//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TD {
  @Test
  public void f() throws InterruptedException {
	  
       WebDriver driver;
	  
	  driver =new ChromeDriver();
	  
	  Thread.sleep(1000);
	  
	  driver.get("https://tirupatibalaji.ap.gov.in/#/registration");	
	  
	  Thread.sleep(3000);
	 	  
	  Select country =new Select(driver.findElement(By.name("countryS"))); country.selectByVisibleText("India");
	  
	  
	  Thread.sleep(1000);
	  
	 Select State = new Select(driver.findElement(By.name("stateS"))); State.selectByVisibleText("Karnataka");
	  


	  
	  
	  
	  
	   
	
	  

	  
	 
	 
  }
}
