package pageobjectconversion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.Abstract_Component_in_Pages;

public class ProductCatalog extends Abstract_Component_in_Pages {
	
	WebDriver driver;
	By addtocart = By.xpath("(//button[@class='btn w-10 rounded'])[1]");
	public ProductCatalog(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".mb-3")
	List<WebElement> product;
	
	public List<WebElement> getproductlist() {
		waitsforelements();
		return product;
	}
	
	public WebElement getproductbyname(String productName) {
		WebElement prod = getproductlist().stream().filter(products->products.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productName) {
		
		WebElement prod = getproductbyname (productName);
		prod.findElement(addtocart).click();
		
	}

	
}
