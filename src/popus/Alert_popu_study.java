package popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popu_study {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		// handling of Alert popup
		// thats why we need change the focus main page to alert 
		
		Alert b = driver.switchTo().alert();
		Thread.sleep(2000);
		// if i want to click on cancel button then we use dismiss method
		
		b.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("good evening");
		

	}

}
