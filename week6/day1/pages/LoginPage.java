package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		//m1
		//LoginPage lp=new LoginPage();
		//return lp;
		
		//m2
		return this;
	}
	
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;

	}
	
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//m1
		// HomePage hp =new HomePage();
		// return hp;
		
		//m2
		return new HomePage(driver);

	}
}
