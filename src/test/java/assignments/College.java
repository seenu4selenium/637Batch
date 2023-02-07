package assignments;


//ASSIGNMENT 4//



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class College {
  @Test
  public void f() throws InterruptedException {
	  
	WebDriver driver;
	
	Thread. sleep(100);
	
	driver = new ChromeDriver();
	
	driver.get("https://collegeweeklive.com/go-signup/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("firstName")).sendKeys("ABC");
	
	driver.findElement(By.id("lastName")).sendKeys("S");
	
	driver.findElement(By.name("emailAddress")).sendKeys("ABC@gmai.com");
	
	driver.findElement(By.id("phoneNumber")).sendKeys("888888");
	

	
	driver.findElement(By.id("password")).sendKeys("777");
	
	driver.findElement(By.name("ConfirmPassword")).sendKeys("777");
	
	
	//Check Boxes//

	driver.findElement(By.id("questions[q_135]")).click();
	
	driver.findElement(By.name("questions[q_136]")).click();
	
	driver.findElement(By.id("questions[q_137]")).click();
	
	driver.findElement(By.id("submit")).click();
	
	
	

	
	

	
	

	
	
	
	

	
	
	
	
	
	
	
	
	
  }
}
