package stepdefinition;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginRestAssured {
	
	
	String response;
	private HashMap<String,String> map;
	
	@Given("user launch the browser using baseURI {string}")
	public void userLaunchTheBrowserUsingBaseURI(String baseUri) {
	    
		RestAssured.baseURI = baseUri;
		
	}
	
	@When("user enters the user name as {string} and password as {string}")
	public void userEntersTheUserNameAsAndPasswordAs(String user, String pass) {
		


        this.map = new HashMap<>();
      
        this.map.put("userName", user);
        this.map.put("password", pass);


	}

	@Then("user receives the vaild token")
	public String userReceivesTheVaildToken() {
		
	  String response = RestAssured.given().log().all().contentType(ContentType.JSON).body(this.map).when().post("/Account/v1/GenerateToken")
		.then().log().all().assertThat().statusCode(200).extract().path("token");
	  System.out.println(response);
	  
	  return response;
	    
	}

	@Then("user fethes a list of books using the vaild token")
	public void userFethesAListOfBooksUsingTheVaildToken() {
		
		RestAssured.given().log().all().header("Authorization", "Bearer "+userReceivesTheVaildToken()).when()
		.get("https://demoqa.com/BookStore/v1/Books")
		.then().log().all();
	    
	}

	@Then("user returns status code {int} and a non-empty token")
	public void userReturnsStatusCodeAndANonEmptyToken(Integer int1) {
	    
		
		
	}

	@Then("books API returns status code {int}")
	public void booksAPIReturnsStatusCode(Integer int1) {
		
		
	    
	}

	@Then("response contains at least one book with the title field present")
	public void responseContainsAtLeastOneBookWithTheTitleFieldPresent() {
	    
	}


}
