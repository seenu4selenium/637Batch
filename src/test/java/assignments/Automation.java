package assignments;

//ASSIGNMENT---6-----(6.1)//


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Automation {
  @Test
  public void f() {
	  
	  WebDriver driver;
	  
	  driver =new ChromeDriver();
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  Select speed = new Select(driver.findElement(By.id("speed"))); speed.selectByVisibleText("Fast");
	  
	  Select file = new Select(driver.findElement(By.id("files"))); file.selectByVisibleText("PDF file");
	    
	  Select number =new Select(driver.findElement(By.id("number"))); number.selectByVisibleText("4");
	  
	  Select Product = new Select(driver.findElement(By.id("products"))); Product.selectByVisibleText("Iphone");
	  
	  Select Animal = new Select(driver.findElement(By.id("animals"))); Animal.selectByValue("babycat");
			  						  
	
			 
  }
}


//ASSIGNMENT 6//--6.1