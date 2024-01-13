package misc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomList {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		 
		driver.findElement(By.name("q")).sendKeys("TATA");
		Thread.sleep(1000);
	
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		System.out.println("===== for each loop====");
		Thread.sleep(1000);
		for(WebElement a:SearchResult) 
		{
			System.out.println(a.getText());
		}
		
		System.out.println("=============================");
		Thread.sleep(1000);
		String expectedresult = "tata nexon";
		Thread.sleep(1000);
		for(WebElement b:SearchResult)
		{
			String actualResult = b.getText();
			if(actualResult.equals(expectedresult))
			{
				b.click();
				break;
			}
		
		}
		
		
		
//	     System.out.println("===== for loop====");
//		
//		for(int i=0;i<=SearchResult.size()-1;i++)
//		{
//			System.out.println(SearchResult.get(i).getText());
//		}
//		Thread.sleep(1000);
//		System.out.println("=====Itrator====");
//		
//		Iterator<WebElement> b = SearchResult.iterator();
//		while (b.hasNext())
//		{
//			System.out.println(b.next().getText());
//		}
//		Thread.sleep(1000);
//		System.out.println("=====ListItrator====");
//		
//		ListIterator<WebElement> c = SearchResult.listIterator();
//		while (c.hasNext())
//		{
//			System.out.println(c.next().getText());
//		}
//		Thread.sleep(1000);
//		while (c.hasPrevious())
//		{
//			System.out.println(c.previous().getText());
//		}

	}

}
