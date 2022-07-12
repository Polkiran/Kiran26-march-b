package IncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
	  public void z() 
	  {
		  Reporter.log("z is running",true);
	  }
	  @Test
	  public void y() 
	  {
		Reporter.log("y is running",true);  
	  }
	  @Test
	  public void x() 
	  {
		  Reporter.log("x is running",true);
	  }
  }

