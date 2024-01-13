package testNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestTcTrueFalse {
  @Test
  public void TrueFalse() 
  {
	  
	//boolean a=true;
	  boolean b=false;
	  
	  
	  
	  //Assert.assertTrue(b,"b is not true,Tc is failed");
	  
	  Assert.assertFalse(b,"a is true, Tc is failed");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
