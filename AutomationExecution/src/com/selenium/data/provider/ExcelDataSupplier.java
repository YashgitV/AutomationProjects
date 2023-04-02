package com.selenium.data.provider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider(name="loginData")
	public String[][] getDeta() throws Exception {
		
	    File excelfile = new File("C:\\TestData\\Dataprovider.xlsx");
		//exists() method is used to check our excel file is available or not
	     System.out.println(excelfile.exists()); 
		FileInputStream file =new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// checks the how many number of rows present in the sheet.....getPhysicalNumberOfRows()
		int noofrows = sheet.getPhysicalNumberOfRows(); 
		int noofcolumns = sheet.getRow(0).getLastCellNum();
	// checks the how many number of rows present in the sheet but excluding the header row.getLastRowNum()
		//System.out.println(sheet.getLastRowNum()); 
		String[][] data = new String[noofrows-1][noofcolumns];
		for(int i=0;i < noofrows-1;i++)
		{
			for(int j=0;j < noofcolumns;j++)
			{
				DataFormatter dt = new DataFormatter();
				data[i][j]=dt.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			
			System.out.println();
			
		}
		workbook.close();
		file.close();
		///System.out.println(Arrays.toString(data));
		return data;
		
	}

}
