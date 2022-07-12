package Serialandparallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTest1 {
  @Test
  public void f() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
        Thread.sleep(2000);
  }
  @Test(priority = 2)
  public void firefox() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
      Thread.sleep(1000);
  }
}
