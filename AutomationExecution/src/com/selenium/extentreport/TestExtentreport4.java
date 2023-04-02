package com.selenium.extentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestExtentreport4 {

	public static void main(String[] args) throws Exception
	{
	
		 ExtentReports extentreports = new ExtentReports();
		 //if we want to use file instatnce in extentsparkreporter we need to create file instance
		 File f1 = new File("report.html");
		 ExtentSparkReporter sparkReporter = new ExtentSparkReporter(f1);
		 extentreports.attachReporter(sparkReporter);
		 
		//Test case1 ---(method chaining process.. i.e,we can directly call the log methods)
	     extentreports.createTest("Test based test") //even though if we add all logs in one line we won't get any issues but readability is not there
	     .log(Status.INFO,"info1")
	     .log(Status.INFO, "<b>info2</b>") //<b> tag is used is display data in the bold 
	     .log(Status.INFO, "<i>info3</i>") //<i> tag is used is display data in the italic
	     .log(Status.INFO, "<b><i>info4</i></b>");
	     
	     //log the xml data into extent report
	     String xmldata = "<menu id=\"file\" value=\"File\">\r\n" + 
	     		"  <popup>\r\n" + 
	     		"    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n" + 
	     		"    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n" + 
	     		"    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n" + 
	     		"  </popup>\r\n" + 
	     		"</menu>";
	   //log the json data into extent report
	     String jsondata = "{\"menu\": {\r\n" + 
	     		"  \"id\": \"file\",\r\n" + 
	     		"  \"value\": \"File\",\r\n" + 
	     		"  \"popup\": {\r\n" + 
	     		"    \"menuitem\": [\r\n" + 
	     		"      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n" + 
	     		"      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n" + 
	     		"      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n" + 
	     		"    ]\r\n" + 
	     		"  }\r\n" + 
	     		"}}";
		 
	     extentreports.createTest("xml based data")
	     .info(MarkupHelper.createCodeBlock(xmldata, CodeLanguage.XML)); //here we have to specify what type of data we need to store
	     
	     extentreports.createTest("json based test")
	     .log(Status.INFO, MarkupHelper.createCodeBlock(jsondata,CodeLanguage.JSON));//here we have to specify what type of data we need to store
	     
	     List<String>listData = new ArrayList<>();
	     listData.add("selenium");
	     listData.add("java");
	     listData.add(".net");

	     Map<Integer,String> mapData = new HashMap<>();
	     mapData.put(101,"selenium");
	     mapData.put(102,"java");
	     mapData.put(103,".net");

	     Set<Integer> setData = mapData.keySet();
	     
	     extentreports
	     .createTest("list based data")
	     .info(MarkupHelper.createOrderedList(listData))
	     .info(MarkupHelper.createUnorderedList(listData));
	     
	     extentreports
	     .createTest("map based data")
	     .info(MarkupHelper.createOrderedList(mapData))
	     .info(MarkupHelper.createUnorderedList(mapData));
	     
	     extentreports
	     .createTest("set based data")
	     .info(MarkupHelper.createOrderedList(setData))
	     .info(MarkupHelper.createUnorderedList(setData));
	     
	     extentreports
	     .createTest("Highlight the test")
	     .info("This is not a highlated message")
	     .info(MarkupHelper.createLabel("This is a highlight message", ExtentColor.RED));
	     
	     try 
	     {
	    	 int i = 5/0;
	     }catch(Exception e)
	     {
	    	 extentreports
		     .createTest("Exception test1")
		     .fail(e);
	     }
	     
	     Throwable t = new RuntimeException("this is a custom Exception");
	     extentreports
	     .createTest("Highlight the test")
	     .fail(t);
	     
		//if we don't mention the flush() method at the end.report is not getting generate
		 extentreports.flush();
		 Desktop.getDesktop().browse(new File("report.html").toURI()); //if we want to open any type of the file(i.e report) directly in default browser
		 
}
	
}

