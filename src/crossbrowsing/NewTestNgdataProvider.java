package crossbrowsing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class NewTestNgdataProvider {
  @Parameters({"firstN","lastN","mobN"})
	@Test()
  public void fbDP(String firstName,String lastName,String mobileNum) throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1540);
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(1540);

	  driver.findElement(By.name("firstname")).sendKeys(firstName);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("lastname")).sendKeys(lastName);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobileNum);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
