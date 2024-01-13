package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframeUsage {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	 WebElement mainpagetext = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
	
	System.out.println(mainpagetext.isDisplayed());
	
	Thread.sleep(1000);
	
	driver.switchTo().frame("frame1");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shree shyam");
	
	driver.switchTo().frame("frame3");
	Thread.sleep(500);
	driver.findElement(By.id("a")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(500);
	
	driver.switchTo().frame("frame2");
	
	
	WebElement iframedropdown=driver.findElement(By.id("animals"));
	Select se=new Select(iframedropdown);
	System.out.println(se.isMultiple());
	se.selectByValue("big baby cat");
	
	
	
	
	                                      
}





}
