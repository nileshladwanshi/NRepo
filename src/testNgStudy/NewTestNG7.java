package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNG7 {
 
	@Test(priority = -9)
  public void caseesA() 
  {
	  Reporter.log("case a is running", true);
  }
	
  @Test(dependsOnMethods = {"casees3"})
  public void casees1() 
  {
	  Reporter.log("case 1 is running", true);
  }
  
  @Test
  public void casees2() 
  {
	  Reporter.log("case 2 is running", true);
  }
  
  @Test(invocationCount = 3,priority = -1)
  public void casees3() 
  {
	  Reporter.log("case 3 is running", true);
  }
  @AfterMethod
  public void afme()
  {
	  Reporter.log("afME is running", true);
}
  @BeforeMethod
  public void befme()
{
	Reporter.log("befMe is running", true);  
} 
  
  
  
  
  
  
  
  
}
