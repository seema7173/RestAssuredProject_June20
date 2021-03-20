package testCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DEL_Or_Delete_A_Product {

	@Test
	public void delete_A_Product() {
//	RestAssured.baseURI();
		
		HashMap<String, String> payload = new HashMap<String, String>();
			payload.put("id", "966" );
		
			
		Response response = given().baseUri("https://techfios.com/api-prod/api/product")
				.header("Content-Type", "application/json; charset=UTF-8").body(payload).queryParam("id", "1209").when()
				.delete("/delete.php").then().extract().response();

		
		String responseBody = response.getBody().asString();
		System.out.println("responseBody: " + responseBody);
		JsonPath js =new JsonPath(responseBody);
	
		
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
