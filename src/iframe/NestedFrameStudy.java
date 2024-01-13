package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameStudy {

	public static void main(String[] args) throws InterruptedException
{       WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
	 String mainPageText = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println("Main Page Text is "+mainPageText);
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");// switching to main page to outer frame 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");//writing in text box present in outer frame
		Thread.sleep(1000); // switching outer frame to inner frame
        driver.switchTo().frame("frame3");
	    Thread.sleep(1000);
	    driver.findElement(By.id("a")).click();//clicking of check box which is present in inner frame
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		WebElement animalsDropDowm = driver.findElement(By.id("animals"));
		Select s = new Select( animalsDropDowm);// using of dropdown then create an object of select class
		s.selectByValue("big baby cat");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		String MainPage = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	     System.out.println("main Page "+ MainPage);
		
		
		
		
		
		
		
		
		
		
		
	}

}
