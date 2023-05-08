package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	
	@Given ("enter the username as (.*)$")
	public LoginPage enterUsername(String uname) throws IOException  {
		
			try {
				getDriver().findElement(By.id("username")).sendKeys(uname);
				reportStep("username enter successfull", "pass");
			} catch (Exception e) {
				reportStep("username not enter successfull", "fail");
			}
	
		return this;
	}
	
	@And ("enter the password as (.*)$")

	public LoginPage enterPassword(String pwd) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pwd);
			reportStep("password enter successfull", "pass");
		} catch (Exception e) {
			reportStep("password not enter successfull", "fail");
		}
		
		return this;

	}
	
	@When ("click on LoginButton")
	public HomePage clickLoginButton() throws IOException  {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Login is successfull", "pass");
		} catch (Exception e) {
			reportStep("Login is  not successfull", "fail");

		}
		
		return new HomePage();

	}
}
