package TestNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test (timeOut=1000)
  public void f() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("f is running",true);
  }
  @Test
  public void a()
  {
	  Reporter.log(" a is running",true);
  }
  @Test
  public void v() {
	  Reporter.log("v is runnig ",true);
  }
  
}
