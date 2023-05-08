package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

public class HomePage extends BaseClass{

	/*
	 * public HomePage(ChromeDriver driver) { this.driver=driver; }
	 */
	public MyHomePage linkOnCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage();
	}
}
