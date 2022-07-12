package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_divsion_popups {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
		
		System.out.println("popup window is close");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='_3704LK']"));//search box xpath(object)
		
		searchbox.sendKeys("apple 13 pro max");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search button path
	}

}
