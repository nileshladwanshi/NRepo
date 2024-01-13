package SwagLag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_01 {

	public static void main(String[] args)
{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement user_name = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("login-button"));
		
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
