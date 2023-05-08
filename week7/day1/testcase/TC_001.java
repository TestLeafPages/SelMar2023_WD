package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass{
	
	@BeforeTest
	public void setData() {
		testCase="Login";
		testDescripition="Positive data";
		testAuthor="TestLeaf";
		testcategory="sanity";
	}
	
	
	
	
	@Test
	public void loginData() throws IOException {
		
		LoginPage lp= new LoginPage();
		lp.enterUsername("DemoCsr").enterPassword("crmsfa")
		.clickLoginButton();
		

}
}