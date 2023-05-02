package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

public class CreateLead extends BaseClass{
	
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLead enterCname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLaeaf");
return this;
	}
	
public CreateLead enterfname() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
	return this;

		
	}
public CreateLead enterlname() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
	return this;

	
}

public ViewLead clickOnCreated() {
	driver.findElement(By.name("submitButton")).click();
return new ViewLead(driver);
}
}
