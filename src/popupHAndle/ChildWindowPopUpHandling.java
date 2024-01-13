package popupHAndle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUpHandling {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		WebElement mainPageText=driver.findElement(By.className("newtb"));
		
		System.out.println(mainPageText.getText());
		Thread.sleep(1000);
		String mainPageID=driver.getWindowHandle();
		System.out.println("main page id is "+mainPageID);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);	
		Set<String> multiIDS=driver.getWindowHandles();
		
		Iterator<String> ids=multiIDS.iterator();
		
		String mainpageIDs=ids.next();
		String childId=ids.next();
		
		System.out.println("main page id by it is "+mainpageIDs);		
		
		System.out.println("child id is "+childId);
		Thread.sleep(1000);
		driver.switchTo().window(childId);
		
		
		WebElement childPgeText=driver.findElement(By.xpath("//*[text()='Owner & maintainer of – ']"));
		
		System.out.println("Child page text is "+childPgeText.getText());
		
		driver.switchTo().window(mainpageIDs);
	     WebElement againMainText =driver.findElement(By.xpath("//*[text()='[Dummy Controls]']"));
		System.out.println(againMainText.getText());
		
		
		driver.switchTo().window(childId);
		
		driver.close();
		
	}

}
