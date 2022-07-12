package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertuse {
  @Test
  public void Mymethod() 
  {
	  String a="abc";
	  String b="abc";
	 
	  //to use soft assert we need to create object of SoftAssert class
	  
	  SoftAssert soft= new SoftAssert();// created object of soft assert
	  soft.assertNotEquals(a, b," Both are equal TC is Failed");
	  
	 soft.assertNull(b,"Value is not null, TC is failed");
	  soft.assertAll();
  }
}
