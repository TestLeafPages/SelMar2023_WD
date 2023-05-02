package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

public class MyLeads extends BaseClass {

	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLead clickCreatedLead() {
		driver.findElement(By.linkText("Create Lead")).click();

		return new CreateLead(driver);
	}
}
