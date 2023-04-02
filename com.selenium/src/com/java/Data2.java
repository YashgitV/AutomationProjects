 package com.java;

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

public class Data2
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream f2=new FileInputStream("C:\\TestData.xlsx");
		Workbook w1=WorkbookFactory.create(f2);
		Sheet s=w1.getSheet("sheet1");
		Row r1=s.getRow(2);
		Cell c1=r1.getCell(5);
		String v=c1.getStringCellValue();
		System.out.println(v);
		
	}

}
