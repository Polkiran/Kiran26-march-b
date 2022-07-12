package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltPoppus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
	   driver.manage().window().maximize();
	   
	   Thread.sleep(2000);
	   
	 String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
	   System.out.println(text);
	   
	   driver.switchTo().frame(0);
	   String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(text1);
	   
	   
	   
	   
		
	}

}
