package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgNew {
  @Test
  public void new1() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.linkedin.com");
  }
}
