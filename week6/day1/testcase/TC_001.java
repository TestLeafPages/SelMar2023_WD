package testcase;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass{
	
	@Test
	public void loginData() {
		System.out.println(driver);
		LoginPage lp= new LoginPage(driver);
		lp.enterUsername().enterPassword()
		.clickLoginButton();
		

}
}