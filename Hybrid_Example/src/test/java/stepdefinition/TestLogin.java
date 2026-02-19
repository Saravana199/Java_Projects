package stepdefinition;
public class TestLogin {
	
	
	
	/*@Given("The User is on the Login Page")
	public void theUserIsOnTheLoginPage() {
	    driver.get("https://practice.expandtesting.com/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
	}

	@When("user Clicks on Username Option")
	public void userClicksOnUsernameOption() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement name =driver.findElement(By.id("username"));
		name.click();
		
	}

	@When("User Enters the Username as {string}")
	public void userEntersTheUsernameAs(String stringname) {
		
	    name.sendKeys(stringname);
	}
	
	@When("User Enters the Username1 as {string}")
	public void userEntersTheUsername1As(String string) {
		 name.sendKeys(string);
	}
	
	@When("user Clicks on Password Option")
	public void userClicksOnPasswordOption() {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement pass= driver.findElement(By.id("password"));
		pass.click();
	}

	@When("User Enters the Password as {string}")
	public void userEntersThePasswordAs(String stringpassword) {
	    pass.sendKeys(stringpassword);
	}
	
	@When("User Enters the Password1 as {string}")
	public void userEntersThePassword1As(String string) {
		pass.sendKeys(string);
	} 
	
	@Given("user Clicks on Login icon")
	public void userClicksOnLoginicon() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement submit = driver.findElement(By.id("submit-login"));
		submit.click();
	}

	@Then("user is on the Home Page")
	public void userIsOnTheHomePage() {
		
		WebElement text = driver.findElement(By.xpath("//h4[@class='SuperSecretPassword!']"));
		String message = text.getText();
	    Assert.assertEquals("the user is on home page", "Welcome to the Secure Area. When you are done click logout below.", message);
	}*/


}
