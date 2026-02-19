package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="h3")
	WebElement hometitle1;
	
	@FindBy(id="res")
	WebElement count;
	
    @FindBy(xpath=("(//button[@class='btn w-40 rounded'])[1]"))
	WebElement viewicon;
    
    @FindBy(xpath=("//h6[text()='product details']"))
    WebElement productdetails;
    
    @FindBy(xpath=("//button[text()='Add to Cart']"))
    WebElement addtocarticon;
    
	public String filtericon() {
		
		String hometitleorg =hometitle1.getText();
		System.out.println(hometitleorg);
		return hometitleorg;
	}
    public String countresults() {
    	String countitems= count.getText();
    	System.out.println(countitems);
    	return countitems;
    }
	
    public String viewicontest() {
    	viewicon.click();
    	String product =productdetails.getText();
    	return product;
    }
    
    public void addtocart() {
    	addtocarticon.click();
    }
}
