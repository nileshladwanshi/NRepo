package testNgStudy;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTestNG4 {
  @Test
  public void tc1() 
  {
	  Reporter.log("TC1 is running", true);
  }
  @AfterClass
  public void afcl()
  {
	  Reporter.log("AfCl is running", true);
  }
  @AfterMethod
  public void aftmeth()
  {
	  Reporter.log("aftMeth is running", true);
  }
  @BeforeClass
  public void befClass()
  {
	  Reporter.log("befClass is running", true);
  }
  @BeforeMethod
  public void befMeth()
  {
	  Reporter.log("befMeth is running", true);
  }
  
  @BeforeSuite
  public void befSuit()
  {
	  Reporter.log("BefSuit is running", true);
  }
  
  @AfterSuite
  public void AftSuit()
  {
	  Reporter.log("AftSuit is running", true);
  }
  
}
