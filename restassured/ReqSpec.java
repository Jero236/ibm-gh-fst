package GitHub;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class ReqSpec {
	
	RequestSpecification requestSpec;
	String sshKey;
	long genId;
	
	@BeforeClass
	public void setUp() {
		
		requestSpec = new RequestSpecBuilder()
				.setContentType("application/json")
				.addHeader("Authorization", "Bearer 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")
				// Set base URL
				.setBaseUri("https://api.github.com")
				// Build request specification
				.build();
		
	}
	
	@Test(priority = 1)
	public void addSshKey() {
		
	    String requestBody = "{\n"
	            + "\"title\":\"TestAPIKey\",\n"
	            + "\"key\":\"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIEF4DsYtvyVhY5Cwyd+ATz8CeprlU5Dw+40/X3RRD6CJ azuread/jeromeu@IBM-28NRR24\"\n"
	            + "}";
	    
	    // Send POST request
	    Response response = given()
	            .spec(requestSpec)
	            .body(requestBody)
	            .when()
	            .post("/user/keys");

	    // Print response (optional)
	    response.prettyPrint();
	    
	    // Assertions
	    Assert.assertEquals(response.getStatusCode(), 201);

	    // Extract generated id
	    genId = response.jsonPath().getLong("id");
	    System.out.println(genId);
	    // Verify id is not null/zero
	    Assert.assertNotNull(genId);

	}
	
	@Test(priority = 2, dependsOnMethods = "addSshKey")
	public void  getallSshKeys() {
		System.out.println("ID = " + genId);
	    // Send GET request
	    Response response = given()
	            .spec(requestSpec)
	            .pathParam("keyId", genId)
	            .when()
	            .get("/user/keys/{keyId}");

	    // Print response to console
	    response.prettyPrint();

	    // Print response to TestNG report
	    Reporter.log(response.asPrettyString());

	    // Assertions
	    Assert.assertEquals(response.getStatusCode(), 200);

	    // Verify the returned id matches the created id
	    Assert.assertEquals(response.jsonPath().getLong("id"), genId);

	    // Verify title
	    Assert.assertEquals(response.jsonPath().getString("title"), "TestAPIKey");

	    // Verify key is present
	    Assert.assertTrue(response.jsonPath().getString("key").startsWith("ssh-ed25519"));
	}
	
	@Test(priority = 3, dependsOnMethods = "addSshKey" )
	public void deleteKey() {

	    Response response = given()
	            .spec(requestSpec)
	            .pathParam("keyId", genId)
	            .when()
	            .delete("/user/keys/{keyId}");

	    // Print status code
	    System.out.println("Status Code: " + response.getStatusCode());

	    // Print response body (DELETE 204 usually has no body)
	    System.out.println(response.asString());

	    // Print to TestNG report
	    Reporter.log("Status Code: " + response.getStatusCode());
	    Reporter.log(response.asString());

	    // Assertion
	    Assert.assertEquals(response.getStatusCode(), 204);
	}

}
