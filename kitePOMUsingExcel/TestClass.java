package kitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\DELL\\Desktop\\Kiran\\Atomation\\Selenium\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName(UN);
		login.sendPassword(PWD);
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin(PIN);
		pin.clickOnContinueButton();
		Thread.sleep(2000);
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName(UN);
		home.logOut();
		driver.close();
	}

	
	}


