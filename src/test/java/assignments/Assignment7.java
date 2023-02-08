package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		String firstName= driver.findElement(By.id("firstNameError")).getText();
		System.out.println(firstName);
		
		String lasttName= driver.findElement(By.id("lastNameError")).getText();
		System.out.println(lasttName);
		
		String email= driver.findElement(By.id("emailAddressError")).getText();
		System.out.println(email);
		
		String MobileNo= driver.findElement(By.id("phoneNumberError")).getText();
		System.out.println(MobileNo);
		

		String psw= driver.findElement(By.id("passwordError")).getText();
		System.out.println(psw);
		
		String country= driver.findElement(By.id("nationalityError")).getText();
		System.out.println(country);
		
		
		String changepsw= driver.findElement(By.id("ConfirmPasswordError")).getText();
		System.out.println(changepsw);
		
		String attendee= driver.findElement(By.id("attendeeTypeError")).getText();
		System.out.println(attendee);
		
		
		
		

		
		
		

	}

}
