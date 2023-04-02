package com.restapi4;

import static org.testng.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ParsingJsonResponseData {
	
	
	//@Test(priority=1)
	void testJsonResponse()
	{
		//approach1
		/*given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("http://localhost:3000/book")
		
		.then()
		.statusCode(200)
		.header("Content-Type","application/json; charset=utf-8")
		//.body("book[3].title",equalTo("The Lord of the Rings"))
		.log().all();  */
		
		//approach2
		
		Response res = given()
		     .contentType(ContentType.JSON)
		
		   .when()
		     .get("http://localhost:3000/book");
		
		 
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
		//String bookname = res.jsonPath().get("book[3].title").toString();
		//System.out.println(bookname);
		//Assert.assertEquals(bookname,"The Lord of the Rings");
					
	}
	
	@Test(priority=2)
	void testJsonResponseBodyData()
	{
		
		Response res = given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("http://localhost:3000/book");
		

		JSONObject jo = new JSONObject(res.asString());
		
		/*for(int i=0;i<jo.getJSONArray("book").length();i++)
		{
			String booktitle = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
			 System.out.println(booktitle);
		} */
		
		// search for the title of the book in Json--validation1
		
		/*boolean status = false;
		for(int i=0;i<jo.getJSONArray("book").length();i++)
		{
			String booktitle = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
			 if(booktitle.equals("The Lord of the Rings"))
			 {
				 status=true;
				 break;
			 }
		} */
		
		//Assert.assertEquals(status,true);
		
		//validate the total price of the book
		
		double totalprice = 0;
		for(int i=0;i<jo.getJSONArray("book").length();i++)
		{
			String price = jo.getJSONArray("book").getJSONObject(i).get("price").toString();
			
				 totalprice=totalprice+Double.parseDouble(price);
			
		} 
	}
	
	
	
	
	
	
	
	

}
