package com.restapi1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class ApiRquests {
	
	int id;
	@Test(priority=1)
	public void getUser()
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
		
	}

	
	@Test(priority=2)
	public void CreateUser()
	{
		
		HashMap data = new HashMap();
		data.put("name", "yaswanth kumar1");
		data.put("job","Automation SQA Test Engineer");
		
	id=given()
		.contentType("application/json")
		.body(data)
		
	.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		//.then()
		//	.statusCode(201)
		//.log().all();
	}
	
	@Test(priority=3,dependsOnMethods=("CreateUser"))
	public void updateUser()
	{
		HashMap data = new HashMap();
		data.put("name","kumar2");
		data.put("job","Autoation SQA Engineer");
		
		given()
		.contentType("application/json")
		
		.when()
		.put("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(200)
		.log().all();
		
		 
	}
	
	@Test(priority=4)
	public void deleteUser()
	{
		
		given()
		
		.when()
		.delete("https://reqres.in/api/users/2"+id)
		
		.then()
		.statusCode(204)
		.log().all();
	}
}



