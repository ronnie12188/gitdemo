package TestNG_Learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencies {

	@Test
	public void login()
	{
		String actual = "Sofware";
		String expected = "Test Lab";
		Assert.assertEquals(actual, expected);
		System.out.println("Login");
		
		
	}
	
	@Test (dependsOnMethods="login")
	
	public void DoSomeActivity() {
		System.out.println("activity");
	}
	@Test (dependsOnMethods="DoSomeActivity")
	public void Logout() {
	System.out.println("Logout");
}

}
