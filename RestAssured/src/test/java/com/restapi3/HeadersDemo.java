package com.restapi3;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HeadersDemo {

	
	//@Test(priority=1)
	void testHeaders()
	{
		given()
		
		.when()
		.get("https://google.com/")
		
		.then()
		.header("Content-Type","text/html; charset=ISO-8859-1")
		.and()
		.header("Content-Encoding","gzip")
		.and()
		.header("Server", "gws")
		.log().all();
		
	}
	
	@Test(priority=2)
	void getHeaders()
	{
		Response res = given()
		
		.when()
		.get("https://google.com/");
		
		//get single header info
		String header_value = res.getHeader("Content-Type");
		System.out.println("The value of the Content-Type header is :"+header_value);
		
		
		//get all header info
		
		Headers myheaders = res.getHeaders();
		
		for(Header hd:myheaders)
		{
			System.out.println(hd.getName()+"       "+hd.getValue());
		}
		
	}
}
