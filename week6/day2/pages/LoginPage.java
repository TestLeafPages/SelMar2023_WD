package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	/*
	 * public LoginPage(ChromeDriver driver) { this.driver=driver; }
	 */
	
	
	@Given ("enter the username as (.*)$")
	public LoginPage enterUsername(String uname) {
		getDriver().findElement(By.id("username")).sendKeys(uname);
		
		//m1
		//LoginPage lp=new LoginPage();
		//return lp;
		
		//m2
		return this;
	}
	
	@And ("enter the password as (.*)$")

	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		
		return this;

	}
	
	@When ("click on LoginButton")
	public HomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		
		//m1
		// HomePage hp =new HomePage();
		// return hp;
		
		//m2
		return new HomePage();

	}
}
