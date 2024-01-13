package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		// switching focus from main page to Iframe
		
		driver.switchTo().frame("singleframe");
		Thread.sleep(1000);
		String myText = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]")).getText();
		System.out.println("text type  "+myText );
	
		Thread.sleep(1000);
		// switching focus from frame to main page
	     driver.switchTo().defaultContent();
	
	     Thread.sleep(1000);
	     
	     WebElement botton = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	
	    System.out.println(botton.isDisplayed());
	    
	    Thread.sleep(1000);
	
	
	
	
	
	
	
	}

}
