package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://na.battlegrounds.pubg.com/");
	    
		Thread.sleep(1000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				System.out.println(source);
				
	    String str=RandomString.make(2);// to ass random string this will avoid overrwriting of file
	    
	    File destination=new File("E:\\ScreenShot\\fbimage"+str+".png");
	    
	    FileHandler.copy(source, destination);
	    
	    
	    
		
		
	}

}
