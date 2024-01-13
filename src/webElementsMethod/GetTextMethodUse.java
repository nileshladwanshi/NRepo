package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String expected = "Facebook helps you connect and share with the people in your life.";
		 
		String actualReasult = driver.findElement(By.className("_8eso")).getText();
		
		System.out.println(actualReasult);
		
		//WebElement myElement = driver.findElement(By.className("_8eso"));
		
		if ( expected .equals(actualReasult))
		{
			System.out.println("test is matching TC is passed");
		}
		
		else 
		{
			System.out.println("Text is not matching Tc is failed");
		}
		
		
		
		
		
	}

}
