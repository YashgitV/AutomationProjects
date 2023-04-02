package com.selenium.screenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
	
		try {
			System.out.println(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());
			///if we want to save the screenshot with test name we use the result.getTestContext().getName()..
			CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
			///if we want to save the screenshot with test name we use the result.getMethod().getMethodName()
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}



}
