package com.org.project.GETTraining;

import org.codehaus.groovy.control.HasCleanup;
import org.testng.annotations.*;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;

public class getTutorials {

	//@Test
	public void testcase_01() {
		Response res=given().get("https://reqres.in/api/users?page=2");
		System.out.println(res.asPrettyString());
	}
	HashMap<Object, Object> map=new HashMap<Object, Object>();
	@BeforeClass
	public void postData() {

		map.put("name", "TestName");
		map.put("job", "TestJob");
	}


	public String postTest() {
		return given().contentType("application/json")
				.accept("application/json")
				.body(map)
				.when()
				.post("https://reqres.in/api/users")
				.asPrettyString();
	}
	@Test
	public void test() {
		System.out.println();
	}

}
