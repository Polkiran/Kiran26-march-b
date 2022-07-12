package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enableuse {
  @Test
  public void K()
  {
	  Reporter.log("d is running",true);
  }
  @Test (enabled=false)
  public void K1() 
  {
	  Reporter.log("K1 is running",true);
  }
  @Test 
  public void b() 
  {
	  Reporter.log("b is running",true);
  }
}
