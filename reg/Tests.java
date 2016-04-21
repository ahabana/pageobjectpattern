
package reg;

import com.objects.Featured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests
{
	@Test
	public void signIn()
	{
		String chrome = "/Users/habaa002/Dropbox/20151005/mac/chromedriver";
		System.setProperty("webdriver.chrome.driver", chrome); 
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.disneymoviesanywhere.com/");

		Featured featured = new Featured(driver);

		featured.signIn().click();		
	}
}
