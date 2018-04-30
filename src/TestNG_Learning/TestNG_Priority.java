package TestNG_Learning;

import org.testng.annotations.Test;


public class TestNG_Priority {
	
	@Test(priority=3,description="this test case is 1")
	public void testng1()
	{
	System.out.println("This is first TestNG class1");
	}

	@Test(priority=2,description="this test case is 1")
	public void testng2()
	{
	System.out.println("This is first TestNG class2");
	}
	
	@Test(priority=1,description="this test case is 1")
	public void testng3()
	{
	System.out.println("This is first TestNG class3");
	}
	
	
	
	
	

}
