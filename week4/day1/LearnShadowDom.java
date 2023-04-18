package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class LearnShadowDom {

	public static void main(String[] args) {
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(o);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com/");


		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

		driver.findElement(By.id("password")).sendKeys("Leaf@123");


		driver.findElement(By.id("Login")).click();
		//Learn More
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		Shadow sh= new Shadow(driver);
		sh.setImplicitWait(20);
		
		sh.findElementByXPath("");
		sh.findElementByXPath("");
		//Confirm

	}

}
