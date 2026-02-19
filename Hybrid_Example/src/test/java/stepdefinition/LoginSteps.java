package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;

public class LoginSteps  {
	String title;
	WebDriver driver = new EdgeDriver();
	private Loginpage loginpage = new Loginpage(driver);
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver.get("https://rahulshettyacademy.com/client/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 title =loginpage.getLoginPageTitle();
		System.out.println("The login page title is :" + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String exepectedtilename) {
		
		Assert.assertTrue(title.contains(exepectedtilename));
	}
	
	@Then("registration link should be displayed")
	public void registration_link_should_be_displayed() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assert.assertTrue(loginpage.isregisterlinkexist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginpage.enterusername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginpage.enterpassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginpage.clickloginbutton();
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		loginpage.gethometitle();
	}
	@Then("home page title should be {string}")
	public void home_page_title_should_be(String string) {
	    System.out.println(string);
	    driver.quit();
	}


}
