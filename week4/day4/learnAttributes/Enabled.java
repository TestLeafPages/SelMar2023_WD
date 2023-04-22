package learnAttributes;

import org.testng.annotations.Test;

public class Enabled {

	
	@Test(priority=1,enabled=false)
	public void lauchBrowser() {
		System.out.println("lauchBrowser");
	}
	
	
	@Test()
	public void testCase() {
		System.out.println("testCase");
	}
	
	@Test(enabled=false)

	public void closeBrowser() {
		System.out.println("closeBrowser");

	}
	
	
	@Test()
	public void passurl() {
		System.out.println("passurl");

	}
}
