package popupHAndle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("_30XB9F")).click();
		
		driver.findElement(By.name("q")).sendKeys("sony 4k smart tv");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.className("_4rR01T")).click();
		 driver.switchTo().activeElement();
		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		
		
		
		
		
		
		
		
	}

}
