package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	public Loginpage(WebDriver driver) {
		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(id="login") 
	WebElement log;
	
	@FindBy(xpath = "//a[@class='btn1']")
	WebElement registerlink;
	
	@FindBy(tagName="h3")
	WebElement hometitle;
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
	
    public boolean isregisterlinkexist() {
    	return registerlink.isDisplayed();
    	
    }
	public void enterusername(String username) 
	{
		
		email.sendKeys(username);
	}
	public void enterpassword(String password) {
		pass.sendKeys(password);
	}
	public void clickloginbutton() {
		log.click();
	}
	public void gethometitle() {
		String hometitle1 =hometitle.getText();
		System.out.println(hometitle1);
	}
}
