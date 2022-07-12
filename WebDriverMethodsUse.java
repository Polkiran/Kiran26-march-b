import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverMethodsUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_uses\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//1. get-->to enter in browser or to open an application.
		driver.get("https://www.google.co.in/");
		//2.close-->to close the current tab of the browser opened by Selenium tool.
		
		//driver.close();
		
		//3.quit: to close the all the tabs present in browser opened by Selenium tool.
		
		//driver.quit();
		
		//4. maximize/ minimize() - used to maximize/ minimize the browser
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.

		System.out.println(driver.getTitle());
		
		
}
}