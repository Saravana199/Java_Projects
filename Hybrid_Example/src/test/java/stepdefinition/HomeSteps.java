package stepdefinition;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pages.HomePage;
import pages.Loginpage;

public class HomeSteps {
	
	WebDriver driver = new EdgeDriver();
	private HomePage home = new HomePage(driver);
	Loginpage loginpage = new Loginpage(driver);
	
	@Given("user has already logged in to the application")
	public void userHasAlreadyLoggedInToTheApplication(DataTable dataTable) {
	   List<Map<String,String>> credlist = dataTable.asMaps();
	   String username= credlist.get(0).get("username");
	   String password= credlist.get(0).get("password");
	   driver.get("https://rahulshettyacademy.com/client/");
	   loginpage.enterusername(username);
	   loginpage.enterpassword(password);
	   loginpage.clickloginbutton();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	   home.filtericon();
	}

	@When("user counts the no.of products in the home page")
	public void user_counts_the_no_of_products_in_the_home_page() {
	   home.countresults();
	}

	@Then("user displays the no.of products")
	public void user_displays_the_no_of_products() {
		home.countresults();
		String[] finalcount =home.countresults().split("3");
    	System.out.println(finalcount[1]);
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user views the product using view icon")
	public void user_views_the_product_using_view_icon() {
	    System.out.println(home.viewicontest());
	}

	@When("user add the product to the cart using Add to cart icon")
	public void user_add_the_product_to_the_cart_using_add_to_cart_icon() {
	    home.addtocart();
	}

	@Then("user checks the cart icon was updated")
	public void user_checks_the_cart_icon_was_updated() {
		//WebDriverWait a = new WebDriverWait(driver,Duration.ofSeconds(3));
	   // WebElement ele = a.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@label='Product Added To Cart']")));
	  driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
	   
	}


}
