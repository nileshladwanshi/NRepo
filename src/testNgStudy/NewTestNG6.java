package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNG6 {
  @Test (priority = 6)
  public void tc1() 
  {
	  Reporter.log("TC1 process", true);
  }
  @AfterMethod()
  public void aftMet()
  {
	 Reporter.log("AftMeth process", true);
  }
  
  @BeforeMethod 
  public void BefMeth()
  {
	  Reporter.log("befMethis running", true);
  }
    
  @Test(priority = -5)
  public void TC2()
  {
	  Reporter.log("TC 2 is running", true);
  }
  
  @Test (priority = 1)
  public void TC3()
  {
	  Reporter.log("TC3 is running", true);
  }
  
  
  
  @Test(invocationCount = 3)
  public void TC4()
  {
	  Reporter.log("TC 3 is running", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
