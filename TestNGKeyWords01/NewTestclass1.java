package TestNGKeyWords01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestclass1 {
  @Test
  public void a() 
  {    //Assert.fail();
	  Reporter.log("a is running",true);
  }
  @Test(groups = {"regrassion"})
  public void b()
   {
	  Reporter.log("b is running regrassion",true);
  }
  @Test(groups = {"sanity"})
  public void c()
  {
	  Reporter.log("c is running sanity",true);
  }
  
  
  
  
}
