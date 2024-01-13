package crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCrossBrowser {
  @Test
  public void f() 
  {
	  
	  
	  WebDriver driver =new FirefoxDriver();
	    driver.get("https://www.youtube.com/watch?v=zisAGm5I-Yw");
  
  }
}
