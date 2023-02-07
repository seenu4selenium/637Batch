package assignments;


import org.openqa.selenium.By;

//ASSIGNMENT---6(6.3)//


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TD1 {
  @Test
  public void f() throws InterruptedException {
	  
	WebDriver driver;
	
	driver =new ChromeDriver();
	
	driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	
Thread.sleep(1000);
	
	Select country =new Select(driver.findElement(By.name("countryS"))); country.selectByVisibleText("Switzerland");
	
	driver.findElement(By.name("statesS")).sendKeys("Beautiful");
	
	
	
	
	  
	  
  }
}
