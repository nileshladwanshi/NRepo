package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNG10 {
  @Test(groups = "sanit")
  public void tc6() 
  {
	  Reporter.log("tc6 is running", true);  
  }
  @Test(groups = "regression")
  public void tc7() 
  {
	  Reporter.log("tc7 is running", true);
  }
  @Test(groups = "regression")
  public void tc8() 
  {
	  Reporter.log("tc8 is running", true);
  }
  @Test(groups = "sanit")
  public void tc9() 
  {
	  Reporter.log("tc9 is running", true);
  }
  @Test(groups = "regression")
  public void tc10() 
  {
	  Reporter.log("tc10 is running", true);
  }
  @Test
  public void tc11() 
  {
	  Reporter.log("tc11 is running", true);
  }
}
