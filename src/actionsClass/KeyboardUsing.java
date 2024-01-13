package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardUsing {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		 Actions act = new Actions(driver);
//		 act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		 act.sendKeys(Keys.ENTER).perform();
		 
		 // OR   when we need to perform same action again and again then we use for loop
		 
		 act.click(day).perform();
		 for (int i=0;i<16;i++)
		 {
			 act.sendKeys(Keys.ARROW_DOWN).perform();
			 Thread.sleep(500);
		 }
		 
		 act.sendKeys(Keys.ENTER).perform();
		 
		
		
		

	}

}
