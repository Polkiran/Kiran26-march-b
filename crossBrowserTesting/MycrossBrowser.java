package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MycrossBrowser {
	@Parameters("browserName")
  @Test
  public void cromebrowser(String name)
  {
	  WebDriver driver = null;
 if (name.equals("chrome"))
 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
  }
	else if(name.equals("Firefox"))
		
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/");
    }
} }