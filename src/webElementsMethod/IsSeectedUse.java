package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSeectedUse {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      Thread.sleep(1000);
      
      driver.get("https://www.facebook.com/");
      
      Thread.sleep(1000);
      
      driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
      
      Thread.sleep(2000);
     
//      boolean result = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
//		
//		System.out.println("gender is selected  "+result);
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//input[@value='1']")).click();
//		 Thread.sleep(2000);
//		    boolean result2 = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
//		
//		    System.out.println("gender is selected  "+result2);
//	    
	    WebElement femaleGender = driver.findElement(By.xpath("//input[@value='1']"));

		    boolean result1 = femaleGender.isSelected();
		    System.out.println("gender is selected  "+result1);
		    
		         femaleGender.click();
		         
		         boolean result2 = femaleGender.isSelected(); 
		         System.out.println("gender is selected  "+result2);
		    
	}

}
