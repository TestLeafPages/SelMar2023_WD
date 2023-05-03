package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass{

	@BeforeTest
	public void setData() {
		fileName="CreateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String cname,String fname,String lname) {
		
		LoginPage Lp= new LoginPage();
		Lp.enterUsername("DemoCsr").enterPassword("crmsfa")
		.clickLoginButton().linkOnCrmsfa()
		.clickOnLeads().clickCreatedLead()
		.enterCname(cname).enterfname(fname).enterlname(lname)
		.clickOnCreated().verifyPage();
		
	}
}
