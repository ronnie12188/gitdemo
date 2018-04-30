package TestNG_Learning;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGAssert2 {
	
	
	@Test
	public void VerifyPageTitel()
	{
	

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Wait 10 Sec 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("Https://www.harveynorman.com.au");
		
		//Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia
	
	String myTitle = driver.getTitle();
	System.out.println("The titile is " + myTitle);
	
	
	}
}
