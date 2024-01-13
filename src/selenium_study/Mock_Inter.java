package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock_Inter {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
//	       String Title =driver.getTitle();
//	       System.out.println("Title is "+Title);
//	      
//	       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sayali Jadhav");
//	   	Thread.sleep(1000);
//	       driver.findElement(By.id("pass")).sendKeys("123@asv");
//	   	Thread.sleep(1000);
//	   	driver.findElement(By.name("login")).click();
	   	
	   String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
	       
	       System.out.println(text);
	       
	       
	       
	       
	       
	       
	        

	}

}
