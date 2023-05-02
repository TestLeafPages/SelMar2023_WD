package testcase;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass{

	@Test()
	public void createLead() {
		System.out.println(driver);
		LoginPage Lp= new LoginPage(driver);
		Lp.enterUsername().enterPassword()
		.clickLoginButton().linkOnCrmsfa()
		.clickOnLeads().clickCreatedLead()
		.enterCname().enterfname().enterlname()
		.clickOnCreated().verifyPage();
		
	}
}
