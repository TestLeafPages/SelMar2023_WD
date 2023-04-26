package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateSteps extends BaseClass{

	@When ("Click on CRMSFA link")
	public void crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	
	
	@And ("Click on Leads link")
	public void leads() {
		driver.findElement(By.linkText("Leads")).click();

	}
}
