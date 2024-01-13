package webTableExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String tableHeader=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[1]")).getText();
		System.out.println(tableHeader);
		System.out.println("----------------------------------------------");
		//list of header
		Object tableHeaderList = driver.findElement(By.xpath("//table[@name='BookTable']//tr")).getText();
		System.out.println(tableHeaderList);
		System.out.println("======================================================");
		//List of header with loop
		List<WebElement> tableHeaderList1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		
		for(WebElement th:tableHeaderList1)
		{
			System.out.print(th.getText()+" ");
		}
		System.out.println();
		
		//calling 1 row data from table
		 List<WebElement> tableHeaderList2 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td"));
		 
		for(WebElement l2:tableHeaderList2) {
		
			System.out.print(l2.getText()+" ");
		}System.out.println();
		System.out.println("===========================================");
		
		//read entire single column
		
		for(int i=2;i<=7;i++) {
		WebElement tableHeaderList3 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
		System.out.println(tableHeaderList3.getText());
		}
		
		
		
		
	}

}
