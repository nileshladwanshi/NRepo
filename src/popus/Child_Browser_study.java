package popus;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_study {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
	    WebElement mainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
	
	   System.out.println(mainPageText.getText());
	   Thread.sleep(1000);
	   
	   driver.findElement(By.name("NewTab")).click();
	    Thread.sleep(1000);
	    // switch to child window we should know the ID of child window
	    // 1 type to know = how to get the id of main and child page
	    String mainPageID = driver.getWindowHandle();
	    
	    // use of getWindowHandles() to get all page id
	    
	    Set<String> allWindowID = driver.getWindowHandles();
	    
	    System.out.println(mainPageID);
	    System.out.println(allWindowID);
	    System.out.println("=========================");
	    // 2nd method to know the id of main and child page
	    // we use iterator
	    Iterator<String> it = allWindowID.iterator();
	    Thread.sleep(1000);
	    String mainPageid = it.next();//  getting id of main page
	    String child1ID = it.next();
	    
	    System.out.println("main page id "+mainPageid);
	    System.out.println("main page id "+child1ID);
	    Thread.sleep(1000);
	    System.out.println("=====================================");
	// switching focus main page to child page
	    
	    driver.switchTo().window(child1ID);
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	   WebElement childPgaeText = driver.findElement(By.xpath("//h3[@class='vc_custom_heading']"));
	
	   System.out.println("child page text "+childPgaeText.getText());
	   System.out.println("========================================");
	   Thread.sleep(1000);
	   
	   driver.switchTo().window(mainPageid);
	   Thread.sleep(1000);
	   WebElement mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),'link in new tab')]"));
	
	    System.out.println("main page text "+mainPageText2);
	
	
	
	
	
	
	
	
	}

}
