package testNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestNGNullNotNull {
  @Test
  public void nullNotNull() 
  {
	  
	  //String g = null;
	  
	  String j = "hi";
	  //String t = null;
	  
	  //Assert.assertNull(t,"t is not null,tc is failed");
	  
	  
	  Assert.assertNotNull(j,"Tc is null, test is failed");
	  
	  
	  
	  
	  
	  
	  
  }
}
