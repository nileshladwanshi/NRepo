package webtable_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Study_row_coloumn {

	public static void main(String[] args)
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://testautomationpractice.blogspot.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	   List<WebElement> table = driver.findElements(By.name("BookTable"));
	   // how many rows in the table 
	   List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int numberOfRows = rows.size();
		
		System.out.println("Number of Rows "+numberOfRows);
		
		System.out.println("===================================================");
		
		List<WebElement> coloumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		 
		int NumberOfColoumn = coloumn.size();
		
		System.out.println("Number of coloumn "+NumberOfColoumn);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
