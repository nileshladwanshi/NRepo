package testNgFail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNgFail {
  @Test
  public void tc1() 
  {
	 Reporter.log("tc1 is running", true); 
  }
  @Test
  public void tc2() 
  {Assert.fail();
	  Reporter.log("tc2 is running", true);
  }
  @Test
  public void tc3() 
  {
	  Reporter.log("tc3 is running", true);
  }
  @Test
  public void tc4() 
  {Assert.fail();
	  Reporter.log("tc4 is running", true);
  }
  @Test
  public void tc5() 
  {
	  Reporter.log("tc5 is running", true);
  }
  @Test
  public void tc6() 
  {Assert.fail();
	  Reporter.log("tc6 is running", true);
  }
}
