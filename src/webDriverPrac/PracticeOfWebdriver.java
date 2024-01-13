package webDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfWebdriver {

	public static void main(String[] args)throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://sps.unipune.ac.in/app/Student/Dashboard/Dashboard");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(1000);

		driver.findElement(By.name("firstname")).sendKeys("Nilesh");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ladwanshi");
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();
		
		
		
		
		
		
	}

}
