package MyTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnoTationStudy {
	 @BeforeMethod
	  public void MyMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
		  
	  }
	 
 
	@Test
  public void ValidUserId() 
  {
	  Reporter.log("User Id is Valid",true);
  }
 
  @Test
  public void ValidateDashBoard() 
  {
	 Reporter.log("Dash Board Valid",true); 
  }
  @BeforeMethod
  public void Logintokitteapp() 
  {
	 Reporter.log("Login is Sucess",true); 
  }

  @AfterMethod
  public void metho1after ()
  {
	  Reporter.log("After method is run",true);
  }
@BeforeClass
public void Test12() 

{
	
	Reporter.log("Before Class is run",true);
}
 @AfterClass
 public void Test13() 
 {//Assert.fail();
	 Reporter.log("After Clas is run",true);
 }

}
