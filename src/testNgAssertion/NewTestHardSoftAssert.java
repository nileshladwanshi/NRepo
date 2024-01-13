package testNgAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestHardSoftAssert {
  @Test
  public void f() 
  {
	  String a="hello";
	  String b="hi";
	  String c="GM";
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertNull(c, "c is not null, c is failed");
	  s.assertEquals(a, b,"a and b are not equal, tc is failed");
  
	  s.assertAll();
  }
  @Test
  public void d()
  {
	  String x="hello";
	  String z=null;
	  	  
	  SoftAssert s1=new SoftAssert();
	  
	  s1.assertNotNull(x, "c is not null, c is failed");
	  s1.assertNull(z,"z is not null, tc is failed");
  
	  s1.assertAll();
  
  
  
  }
  
}
