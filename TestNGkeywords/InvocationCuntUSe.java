package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCuntUSe {
  @Test(invocationCount = 3)
  public void MyTest() 
  
  {
	  Reporter.log("Hello",true);
  }
  
  @BeforeMethod
  public void test()
  {
	  Reporter.log("HI",true);
  }
  
}
