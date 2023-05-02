package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

public class ViewLead extends BaseClass{
	
	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLead verifyPage() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
	}
	
	
}
