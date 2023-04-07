package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		//browser launch
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//return type -get -no return-void
		
		//driver.findElement(By.locator("value");
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//select class
		
		//step-1
		
//		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		Select options= new Select(findElement);
		
		Select options= new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		
		//m1-index-[0]
	//	options.selectByIndex(1);
		
		
		//m2-text
		//options.selectByVisibleText("Partner");
		
		
		//m3-values
		
		options.selectByValue("LEAD_EXISTCUST");
		
		Thread.sleep(7000);
		driver.close();
	}

}
