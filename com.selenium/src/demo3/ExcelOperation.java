package demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {

	public static String read(String sheet,int rowno,int cellno) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream f1=new FileInputStream("c://testdata//userdata.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	//String s1=w1.getSheet(sheetname)
			return sheet;
		
		
		
	}
	public static void write()
	{
		

	}

}
