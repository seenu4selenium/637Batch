package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettextAssignment7 {
  @Test
  public static void f() throws Exception {
  
  WebDriver  driver;
  driver = new ChromeDriver(); 
  driver.get("https://collegeweeklive.com/go-signup/");
  Thread.sleep(2000);
  driver.findElement(By.id("submit")).click();
  Thread.sleep(2000);
  //gettext and display
  String errmsg = driver.findElement(By.id("firstNameError")).getText();
  System.out.println(errmsg);
  
  String errmsg1 = driver.findElement(By.id("lastNameError")).getText();
  System.out.println(errmsg1);
  String errmsg2 = driver.findElement(By.id("emailAddressError")).getText();
  System.out.println(errmsg2);
  String errmsg3 = driver.findElement(By.id("phoneNumberError")).getText();
  System.out.println(errmsg3);
  String errmsg4 = driver.findElement(By.id("passwordError")).getText();
  System.out.println(errmsg4);
  String errmsg5 = driver.findElement(By.id("ConfirmPasswordError")).getText();
  System.out.println(errmsg5);
  
}

}