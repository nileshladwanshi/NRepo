package crossbrowsing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCrossBrowserIfElse {
  @Parameters("bName")
	@Test
  public void crossBrowser(String browserName)throws InterruptedException 
  {
	  WebDriver driver = null;
	  if(browserName.equals("chrome")) 
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browserName.equals("fireFox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1540);
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(1540);

	  driver.findElement(By.name("firstname")).sendKeys("first Name");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("lastname")).sendKeys("last Name");
	  driver.findElement(By.name("reg_email__")).sendKeys("5962862865");
	  
	  
	  Thread.sleep(5000);
	  driver.close();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
