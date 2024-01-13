package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNG8 
{
  @Test(enabled = true)
  public void tc1() 
  {
	  Reporter.log("tc 1 is running", true);
  }
  @Test(timeOut = 1500,enabled = true,priority = -3,invocationCount = 3,dependsOnMethods = "tc3")
  public void tc2() throws InterruptedException
  {  Thread.sleep(900);
	  Reporter.log("tc 2 is running", true);
  }
  @Test
  public void tc3()
  {
	  Reporter.log("tc 3 is running", true);
  }
  @Test
  public void tc4()
  {
	  Reporter.log("tc 4 is running", true);
  }
}
