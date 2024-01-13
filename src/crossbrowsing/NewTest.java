package crossbrowsing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	@Test(dataProvider = "sanity",dataProviderClass = NewTestNgdaProvid.class)
  public void fbCreate(String first,String lastname,String mobile) throws InterruptedException 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(1540);
	  driver.findElement(By.name("firstname")).sendKeys(first);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobile);
	  
	  Thread.sleep(7540);

	  driver.close();	  
	  
	  
	  
	  
	  
  }
}
