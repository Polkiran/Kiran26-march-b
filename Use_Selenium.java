


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Selenium {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://vctcpune.com/");
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	
	
	
	
	
	
	
}
}
