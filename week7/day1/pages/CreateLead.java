package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

public class CreateLead extends BaseClass{
	
	/*
	 * public CreateLead(ChromeDriver driver) { this.driver=driver; }
	 */
	
	public CreateLead enterCname(String ComName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(ComName);
return this;
	}
	
public CreateLead enterfname(String fName) {
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	return this;

		
	}
public CreateLead enterlname(String lName) {
	getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	return this;

	
}

public ViewLead clickOnCreated() {
	getDriver().findElement(By.name("submitButton")).click();
return new ViewLead();
}
}
