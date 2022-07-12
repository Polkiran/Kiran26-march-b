package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMehtoUse {
  @Test(priority = 1)
  public void Login() 
  {
	  Reporter.log("Login sucess",true);
	 // Assert.fail();
  }
  @Test(priority = 2)
  public void Verifypin() 
  {
	  Reporter.log("Pin Verified",true);
  }
  @Test (dependsOnMethods = "Login")
  public void logout()
  {
	  Reporter.log("Logout sucess",true);
  }
}
