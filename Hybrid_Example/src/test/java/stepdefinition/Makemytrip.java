package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Makemytrip {
	
	WebDriver driver = new EdgeDriver();
	
	@Given("user is on landingpage")
	public void userIsOnLandingpage() {
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	
	@And("user closes the popup appaears")
	public void userClosesThePopupAppaears() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement img = driver.findElement(By.xpath("//img[@alt='minimize']"));
		img.click();
		WebElement details = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
		details.click();
	}
	
	@When("user select a oneway trip")
	public void userSelectAOnewayTrip() {
		Actions a = new Actions(driver);
		a.click().build().perform();
	    WebElement round =driver.findElement(By.xpath("//li[@data-cy='roundTrip']/span"));
	    round.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    WebElement one =driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']/span"));
	    one.click();
	}
	
	@And("use select the From and To cities")
	public void useSelectTheFromAndToCities() {
		
		WebElement from = driver.findElement(By.id("fromCity"));
		from.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   WebElement from1 = driver.findElement(By.xpath("//input[@placeholder='From']"));
	   from1.sendKeys("Chennai");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	   WebElement city = driver.findElement(By.xpath("(//div[@class='revampedSearchSuggestionMain'])[1]"));
	   city.click();
	  
	 //Actions a = new Actions(driver);
	 //a.keyDown(Keys.ARROW_DOWN).build().perform();
	// a.keyUp(Keys.ARROW_DOWN).build().perform();
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	// a.keyDown(Keys.ENTER).build().perform();
	 //a.keyUp(Keys.ENTER).build().perform();
	}
	
	@And("user selects date")
	public void userSelectsDate() {
	    
	   WebElement date = driver.findElement(By.xpath("//label[@for='departure']//span[@class='lbl_input appendBottom10']"));
	   date.click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   WebElement orgdate = driver.findElement(By.xpath("//div[@aria-label='Sat Jan 10 2026']"));
	   orgdate.click();
	}
	
	@Then("user checks and prints the message in the consol")
	public void userChecksAndPrintsTheMessageInTheConsol() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement from = driver.findElement(By.xpath("//input[@value='Mumbai']"));
		String fromcity= from.getAttribute("value");
		System.out.println(fromcity);
		WebElement to = driver.findElement(By.id("toCity"));
		String tocity= to.getAttribute("value");
		System.out.println(tocity);
		WebElement dt = driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
		String date = dt.getText();
		System.out.println(date);
		Assert.assertEquals(fromcity, "Mumbai");
		System.out.println("Success: 'fromcity' is Mumbai");
		Assert.assertEquals(tocity, "Bengaluru");
		System.out.println("Success: 'tocity' is Bengaluru");
		Assert.assertEquals(date, "10 Jan26");
		System.out.println("Success: 'date' is 10 Jan26");
      }

}
