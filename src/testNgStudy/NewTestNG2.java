package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNG2 {
  @Test
  public void a()
  {
	  Reporter.log("Test a process", true);
  }
  
  @Test

  public void j()
  {
	  Reporter.log("test j procedure", true);
  }
  
  @Test
  public void d()
  {
	  Reporter.log("Test d procedure", true);
  }  
  
  @BeforeMethod
  public void befme() {
	  Reporter.log("before method befme process", true);
  }
  @BeforeMethod
  public void bm() 
  {
	  Reporter.log("Before method bm process", true);
  }
  @AfterMethod
  public void aftmet ()
  {
	  Reporter.log("After method aftmet process", true);
  }
  @AfterMethod
  public void am()
  {
	  Reporter.log("after method am process", true);
  }
  
  
}
