package ExcelSheeetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// create excel sheet and pass the path along with name and extension in File Object
		File myfile=new File("C:\\Users\\DELL\\Desktop\\Kiran\\Atomation\\Selenium\\Book1.xlsx");
		// Using WorkBookFactory class read excel sheet
        // how to read String value
	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name);
		 // how to read numric value
		
		double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(number);
		
		
		
	}

	
}
