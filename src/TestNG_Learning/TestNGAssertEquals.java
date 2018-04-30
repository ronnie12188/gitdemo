package TestNG_Learning;

import org.testng.annotations.Test;

public class TestNGAssertEquals {

	@Test
	public void login()
	{
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
