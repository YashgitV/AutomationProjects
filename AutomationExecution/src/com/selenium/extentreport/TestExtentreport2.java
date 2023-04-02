package com.selenium.extentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestExtentreport2 {

	public static void main(String[] args) throws Exception
	{
	
		 ExtentReports extentreports = new ExtentReports();
	//	 ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\yuva\\eclipse-workspace\\AutomationExecution\\report.html");
		 //using string path
		 // ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report.html");//if we want store the report in subfloder we use ".\"
		 //if we want to use file instatnce in extentsparkreporter we need to create file instance
		 File f1 = new File("report.html");
		 ExtentSparkReporter sparkReporter = new ExtentSparkReporter(f1);
		 extentreports.attachReporter(sparkReporter);
		 //Test case1 
		 ExtentTest test1 = extentreports.createTest("Test1");
		 test1.pass("this test is passed");
		//Test case2
		 ExtentTest test2 = extentreports.createTest("Test2");
		 test2.log(Status.FAIL, "This test is failed");
		//Test case3
		 extentreports.createTest("Test3").skip("This test is skipped");
		 
		 
		 
		//if we don't mention the flush() method at the end.report is not getting generate
		 extentreports.flush();
		 Desktop.getDesktop().browse(new File("report.html").toURI()); //if we want to open any type of the file(i.e report) directly in default browser
		 
}
	
}

