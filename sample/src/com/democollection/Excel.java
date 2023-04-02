package com.democollection;

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
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
FileInputStream f1=new FileInputStream("C:\\TestData\\userdata.xlsx");
Workbook w1= WorkbookFactory.create(f1);
Sheet s1=w1.getSheet("Sheet1");
Row r1=s1.getRow(1);
Cell c1=r1.getCell(0);
String url=c1.getStringCellValue();
 Cell c2=r1.getCell(1);
 String user=c2.getStringCellValue();
 Cell c3=r1.getCell(2);
 String pass=c3.getStringCellValue();
 Cell c4=r1.getCell(3);
 String cname=c4.getStringCellValue();
 Cell c5=r1.getCell(4);
 String desc=c5.getStringCellValue();
 Cell c6=r1.getCell(5);
 String proj=c6.getStringCellValue();
	System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
	ChromeDriver cd1=new ChromeDriver();
	cd1.get(url);
	cd1.findElement(By.name("username")).sendKeys(user);
	cd1.findElement(By.name("pwd")).sendKeys(pass);
	cd1.findElement(By.xpath("//input[@type='submit']")).click();
	cd1.findElement(By.linkText("Projects & Customers")).click();
   cd1.findElement(By.xpath("//input[@value='Add New Customer']")).click();	
   cd1.findElement(By.name("name")).sendKeys(cname);
   cd1.findElement(By.name("description")).sendKeys(desc);
   cd1.findElement(By.name("createCustomerSubmit")).click();
  String g1= cd1.findElement(By.className("successmsg")).getText();
  System.out.println(g1);
  cd1.close();
 
 
 
 
 
 
 
 
 
 

	}

}
