package standalonepage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import pageobjectconversion.LandingPage;
import pageobjectconversion.ProductCatalog;

public class EndtoEnd {

	public static void main(String[] args) {
		
		String productName = "ZARA COAT 3";
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LandingPage lp = new LandingPage(driver);
		lp.loginapplication("balajisaravana1996@gmail.com", "Viratmahi@100");
        ProductCatalog pc = new ProductCatalog(driver);
        List<WebElement> prod = pc.getproductlist();
         pc.addProductToCart(productName);
	}

}
