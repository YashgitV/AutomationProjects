package data2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\TestData.xlsx");
		      Workbook w1 =WorkbookFactory.create(f1);
		         Sheet s1=w1.getSheet("sheet1");
		         Row r1=s1.getRow(1);
		         Cell c1=r1.getCell(4); 
		         String s=c1.getStringCellValue();
		         System.out.println(s);

	}

}
