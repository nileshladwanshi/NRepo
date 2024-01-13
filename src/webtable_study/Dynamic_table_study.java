package webtable_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table_study {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		 int numOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		 // we need to size of column thats why we use tr/th th means header means column 
		int numOfColomn = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th")).size();
		
		// first for loop for 
		// reading of header (means number of column)
 
		for(int h=1;h<=numOfColomn;h++)
		{
			WebElement coloumn = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr["+1+"]/th["+h+"]"));
			System.out.print(coloumn.getText()+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		// second for loop for column
		// reading of rows
		// table body
		
		for(int r=1;r<=numOfRows-1;r++)
		{
			
		for(int i=1;i<=numOfColomn;i++)
		{
			WebElement rows = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+i+"]"));
			System.out.print(rows.getText()+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		}
		
		
		
		
		
		
		
		
	}

}
