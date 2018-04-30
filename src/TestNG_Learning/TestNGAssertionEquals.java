package TestNG_Learning;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionEquals {
	
	
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
	
		WebElement ele = driver.findElement(By.id("shopAllMd"));
		String Heading = ele.getText();
		Assert.assertEquals(Heading, "SHOP ALL PROD");
		
		System.out.println(Heading);
		
	
	
	}
}
