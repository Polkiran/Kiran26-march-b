package WebElementMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi-mZLL0_j3AhUnR2wGHT8ABdcQPAgI");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		//driver.close();
		
		//driver.quit();
		
		

	}

}
