package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestNG5 {
  @Test
  public void tc2() 
  {Reporter.log("TC2 is running", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("BefMeth is running", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AftMeth is running", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("befClass is running", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("aftClass is running", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("befTest is running", true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("AfteTest is running", true);
  }

}
