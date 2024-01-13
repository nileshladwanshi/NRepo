package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		// find out the locator of webelement where we need to perform action
		// example for right click
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// create an object of actions class which will accept driver object as a parameter
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		act.contextClick(rightClickButton).perform();
		
		// example Double click
		 
	        WebElement doubleClickButtom = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
	
	        Actions act1 = new Actions(driver);
	        
	       // act1.moveToElement(doubleClickButtom).doubleClick().build().perform();
	        
	        act1.doubleClick(doubleClickButtom).perform();
		
		
		


	}

}
