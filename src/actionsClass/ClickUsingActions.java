package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.name("login"));
		// create an object of Actions class
	    Actions act = new Actions (driver);
	    
	    // 1st method
//	    act.moveToElement(loginButton).perform();
//	    act.click().perform();
	    
	    // 2nd method
	  //  act.moveToElement(loginButton).click().build().perform();
	    
	    // 3rd method   Directly use click method with parameter
	    
	    act.click(loginButton).perform();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
