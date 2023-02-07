package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Assignment3_JustRechargeIt {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");

		driver.findElement(By.id("txtUserName")).sendKeys("Welcome@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("abcd");
		driver.findElement(By.id("txtCaptcha")).sendKeys("22");
		driver.findElement(By.id("imgbtnSignin")).click();

	}

}
