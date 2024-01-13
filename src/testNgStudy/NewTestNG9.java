package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNG9 {
  @Test(groups = "sanit")
  public void tc1() 
  {
	  Reporter.log("tc1 is running", true);
  }
  @Test(groups = "regression")
  public void tc2() 
  {
	  Reporter.log("tc2 is running", true);
  }
  @Test(groups = "sanit")
  public void tc3() 
  {
	  Reporter.log("tc3 is running", true);
  }
  @Test(groups = "regression")
  public void tc4() 
  {
	  Reporter.log("tc4 is running", true);
  }
  @Test(groups = "sanit")
  public void tc5() 
  {
	  Reporter.log("tc5 is running", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
