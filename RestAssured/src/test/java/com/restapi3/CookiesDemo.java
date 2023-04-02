package com.restapi3;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;


public class CookiesDemo {

	
	//@Test(priority=1)
	void testCookies()
	{
		given()
		
		
		.when()
		.get("https://google.com/")
		
		
		.then()
		.cookie("AEC", "ARSKqsJMV9ZzeJA6RCH5XeTLcSsPHn9306Ng6uR7ZVD2rkVpIMsY926NrA")
		.log().all();
		
	}
	
	@Test(priority=2)
	void getCookiesInfo()
	{
		
		
		Response res = given()
		
		
		.when()
		.get("https://google.com/");
		
		//get single cookie info
		//String cookie_Value =res.getCookie("AEC");
		// System.out.println("value of the cookie is ====>"+cookie_Value);
	    
	    //get all cookies info
	    
	 Map<String,String> cookies_Values= res.getCookies();
	 // System.out.println(cookies_Values.keySet());
	 
	 for(String k:cookies_Values.keySet())
	 {
		 String cookie_Value =res.getCookie("AEC");
		 System.out.println(k+"    "+cookie_Value);
	 }
	 
	
		
		
		
		
	}
}
