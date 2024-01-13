package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNG3 {
  @Test
  public void f() {
	  Reporter.log("test case program 3", true);
  }
  @BeforeClass
  public void befcla()
  {
	  Reporter.log("before class process 1", true);
  }
  
  @BeforeMethod
  public void bme()
  {
	  Reporter.log("before method process 2", true );
  }
  @AfterMethod
  public void aftM()
  {
	  Reporter.log("after method procedure 4", true );
  }
  @AfterClass
  public void aftClas()
  {
	  Reporter.log("Atfer class process 5", true);
  }
  
  @Test
  public void test2()
  {
	  Reporter.log("Test 2 process 6", true);
  }
  
  
  
  
  
  
  
  
}
