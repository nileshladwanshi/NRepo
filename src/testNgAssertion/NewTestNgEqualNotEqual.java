package testNgAssertion;

// static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestNgEqualNotEqual {
  @Test
  public void equals()
  {
	 
	  String p="pune";
	 // String h="pune";
	  String m="mumbai";
	  
	  //equal assert with both value
	  //Assert.assertEquals(p,h,"Tc is failed,p and h are not equal");
	 
	 
	 //not equals to both value
	  
	  Assert.assertNotEquals(m, p,"p and m is equal,Tc is failed");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
  }
}
