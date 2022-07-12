package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		    
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//h6[text()='Sign In'][2]")).click();

		Thread.sleep(1000);
       
		WebElement getOTPButton =driver.findElement(By.xpath("//button[text()='Get OTP'"));
		
		System.out.println(getOTPButton.isEnabled());
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8600966460");
		
		Thread.sleep(1000);
		System.out.println(getOTPButton.isEnabled());
		getOTPButton.clear();
		
		
		
		
		
		
		
		
	}

}
