package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import io.restassured.response.Response;

public class POST_Or_Create_A_Product {

	SoftAssert sf = new SoftAssert();
	
	@Test
	public void create_A_Products() {
		
//	RestAssured.baseURI();
		
		HashMap<String, String> payload = new HashMap<String, String>();
			payload.put("name", "Samsung S22" );
			payload.put("description", "New Phone");
			payload.put("price", "1299" );
			payload.put("category_id", "2" );
			payload.put("category_name", "Electronics" );
		
		Response response = 
				
			given().baseUri("https://techfios.com/api-prod/api/product")
				.header("Content-Type", "application/json; charset=UTF-8").body(payload).queryParam("id", "1209")
			.when()
				.post("/create.php")
			.then().extract().response();

		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
	//	System.out.println("responseBody: " + responseBody);
//		JsonPath js =new JsonPath(responseBody);
////		
//		String productId = js.getString("id");
//		String productName = js.getString("name");
//		String productDescription = js.getString("description");
//		Assert.assertEquals(productId, "1209");
//		Assert.assertEquals(productName, "HP Laptop Elite Pro");
//		Assert.assertEquals(productDescription, "Super fast laptop");
//		
		
		
//		int stausCode = response.getStatusCode();
//		System.out.println("Status Code:" + stausCode);
//		Assert.assertEquals(stausCode, 200);
//
//		String responseBody = response.asString();
//		System.out.println(responseBody);
//
//		long responseTime = response.getTimeIn(TimeUnit.MILLISECONDS);
//		System.out.println("Response Time: " + responseTime);
//		if (responseTime <= 1000) {
//			System.out.println("Response time is within the range");
//		} else {
//			System.out.println("Not accepted!");
//		}
//	}

}
}
