package Generic_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Data_driven_testing {
	public static void getPhoto(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Excel/Test_data.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet");
		Row r = sh.createRow(0);
		Cell c = r.getCell(1);
		String value = c.toString();
		System.out.println(value);
		
	}
	
	

}
