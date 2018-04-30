package TestNG_Learning;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGBeforeAfterClass {
	
	WebDriver driver;
	 
	@BeforeClass
	public void StartBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
		
	@Test
	public void Norman() {
		
		System.out.println("this is test");
	}
	@AfterClass
		public void harvey() throws InterruptedException {
		System.out.println("test1");
			Thread.sleep(2000);
			driver.quit();
		}
		}

	


