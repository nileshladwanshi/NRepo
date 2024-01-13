package dropdownListUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(2000);
	    
		
	    WebElement element = driver.findElement(By.name("birthday_day"));
	       Thread.sleep(1000);
           Select sDate = new Select(element);
           Thread.sleep(1000);
           sDate.selectByValue("13");
	     
	       Thread.sleep(1000);
	       
	    WebElement element2 = driver.findElement(By.id("month"));
	       Thread.sleep(1000);
	       Select sMonth = new Select(element2);
	       Thread.sleep(1000);
	       sMonth.selectByVisibleText("Jul");
	       
	       Thread.sleep(1000);
	       
         WebElement element3= driver.findElement(By.id("year"));
	        Thread.sleep(1000); 
	        Select sYear = new Select(element3);
	        Thread.sleep(1000);
	        sYear.selectByValue("2018");
	       
	       
	       
	       
	       
	       
		
		
		

	}

}
