package factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


	  public  WebDriver driver;

		public   WebDriver intializedriver() throws IOException  {
			
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resource/com/properties/config.properties");
			prop.load(fis);
			String browsername =  prop.getProperty("browser");
			
			if(browsername.equalsIgnoreCase("edge")) {
				 driver = new EdgeDriver();
				
			}
			
			else if(browsername.equalsIgnoreCase("chrome")){
				 driver = new ChromeDriver();
				
			}
			
			else if(browsername.equalsIgnoreCase("firefox")) {
				 driver = new FirefoxDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.manage().window().maximize();
			return driver;
				
		}
		
		
}

