package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathtextMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/"); 
		driver.findElement(By.xpath("//input[@id='src']")).clear();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("shirdi");
		
		driver.findElement(By.xpath("//input[@id='dest']")).clear();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("pune");
		
//		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[5]/span/div[4]/span")).click();
//		Thread.sleep(4200);
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);

		driver.quit();
		
		
		
		
		
		
		
		
	}

}
