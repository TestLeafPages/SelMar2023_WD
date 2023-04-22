package learnAttributes;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1)
	public void lauchBrowser() {
		System.out.println("lauchBrowser");
	}
	
	
	@Test(priority=-1)
	public void testCase() {
		System.out.println("testCase");
	}
	
	@Test(priority=-10)

	public void closeBrowser() {
		System.out.println("closeBrowser");

	}
	
	
	@Test(priority=3)
	public void passurl() {
		System.out.println("passurl");

	}
	
	
	@Test
	public void login() {
		System.out.println("login");

	}
	
	
	
	
	
	
	
}
