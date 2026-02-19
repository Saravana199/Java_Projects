package abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract_Component_in_Pages {
	
	WebDriver driver;
	
	public Abstract_Component_in_Pages(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void waitsforelements() {
		
		WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(2));
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	}

	public void waitforelementdisappear() {
		WebDriverWait b = new WebDriverWait(driver, Duration.ofSeconds(2));
		b.until(ExpectedConditions.invisibilityOf(null))
	}
}
