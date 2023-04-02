package com.selenium.data.provider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testdataprovider2 {
	
	 ChromeDriver driver;

	@Test(dataProvider="dp1")
	public void TestLogin(String[] s) throws Exception
	{	
		System.out.println(s[0]+" >> "+s[1]);
		//System.out.println(s[0]+" >> "+s[1]);
		//System.out.println(username+" ----- "+password);
		/*for(int i=0;i< s.length;i++)
		{
			System.out.println(s[i]);
		} */
		System.out.println("-------");
	}  
	
/*	@DataProvider()
	public Object[] dp1() ////it can be String[],Integer[] or Object[] .....single dimensional array
	{
		Object[] data = new Object [] {1,"data",3};
		
		return data;
	}  */
	
	@DataProvider()
	public Iterator<String[]> dp1() ////it can be String[][],Integer[][] or Object[][] .....two dimensional array
	{
	/*	String[][] data = new String[][]{
			{"data","123"}, 
			{"java","456"} ,
			{"hyd","789"}
			};  */
		 
	/*	String[][] data = new String[][]{
			{"data","123","567","demo"}, 
			{"java","456"} ,
			{"hyd","789","khy"}
			}; */
		
	/*	Object[][] data = new Object[][]{ ///object 
			{"data",123,567,"demo"}, 
			{"java",456} ,
			{"hyd",789,"khy"}
			}; */
		
	/*	List<String> data = new ArrayList();///object 
		data.add("yaswanth");
		data.add("kumar");
		return data.iterator();  */
		
		Set<String[]> data = new HashSet();///object 
		data.add(new String[] {"yaswanth","430"});
		data.add(new String[] {"kumar","434"});
		return data.iterator();
	}  

}
