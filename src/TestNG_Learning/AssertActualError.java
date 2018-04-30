package TestNG_Learning;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertActualError {
		
		
			// TODO Auto-generated method stub
			@Test
			public void CaptureErrorMSG() throws InterruptedException {
			
			
		
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			// Wait 10 Sec 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("Https://www.harveynorman.com.au");
			//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
			
			// 1. LinkText Element
			driver.findElement(By.linkText("Account")).click();	
			
			
			
			
			Thread.sleep(1000);
				
			
			
			driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
			String EmailErrorActual = "Please enter your email address.";
			String PasswordErrorActual = "Please enter your password."	;	
			String EmailError = driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
			String PasswordError = driver.findElement(By.xpath("//*[@id=\"pass-error\"]")).getText();
			
		//	System.out.println(EmailError);
		//	System.out.println(PasswordError);
			
			//Type 1
			
			Assert.assertEquals(EmailErrorActual, EmailError);
			
			//Type 2
			Assert.assertTrue(PasswordError.contains("Please enter your password."));
			
			
			
		
			//driver.quit();
			
			
			
			
			
}

}

		

	
	
	
	
	
	
	
	
	
	
	
	
	
