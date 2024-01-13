package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethodStudy
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sarika Jagtap");
	
	Thread.sleep(1000);
	//locator = id
	
	driver.findElement(By.id("email")).sendKeys("abcd");

	Thread.sleep(1000);
	
	//webelement method ----- clear();
	
	//driver.findElement(By.id("email")).clear();

	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	// link used
	//driver.findElement(By.className("_6ltj")).click();
	
	// GetText method use
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
