package demo;

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

public class UserData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream f1=new FileInputStream("C://TestData//userdata.xlsx");
Workbook n1=WorkbookFactory.create(f1);
Sheet s1 = n1.getSheet("Sheet1");
Row r1 = s1.getRow(2);
Cell v1 = r1.getCell(3);
String s =v1.getStringCellValue();
System.out.println(s);


	}

}
