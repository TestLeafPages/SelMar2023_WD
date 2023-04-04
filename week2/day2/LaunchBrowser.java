package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//chrome,edge,....
		
		//launchbrowser
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver= new EdgeDriver();
		//to max screen
		
		driver.manage().window().maximize();
		
		//to load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//return type -get -no return-void
		
		//driver.findElement(By.locator("value");
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.close();
		
	}

}
