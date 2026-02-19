package pageobjectconversion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.Abstract_Component_in_Pages;

public class LandingPage extends Abstract_Component_in_Pages {
	
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	

	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement log;

	public void loginapplication(String mail, String Password) 
	{
		
		email.sendKeys(mail);
		pass.sendKeys(Password);
		log.click();
	}
	
	
}
