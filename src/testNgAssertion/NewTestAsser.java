package testNgAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestAsser {
  @Test
  public void tc1()
  {
//	  boolean g=true;
//	  boolean h=false;
//	  System.out.println();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://en-gb.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	 
	  
	  boolean result=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	 
	  System.out.println(result);
	  
	  if(result)
	  {
		  System.out.println("Tc is passed, radio button is selected");
	  }
	  else
	  {
		  System.out.println("Tc is failed, radio button is not selected");
	  }
	  
	  Assert.assertTrue(result,"Tc is failed,radio button is not selected");
	  
	  //Assert.fail();
	  
	  
	  
	  
	  
	  
	  
	  
	  //Reporter.log("tc is running", true);
  }
}
