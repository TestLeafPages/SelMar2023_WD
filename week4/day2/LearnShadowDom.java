package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class LearnShadowDom {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(o);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");


		WebElement c = driver.findElement(By.id("username"));
		c.sendKeys("hari.radhakrishnan@qeagle.com");

		

		
       File scr1 = c.getScreenshotAs(OutputType.FILE);
		
		//step2-create path
		File dst1=new File("./snaps/s1.png");
		
		//step3
		FileUtils.copyFile(scr1, dst1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		

		driver.findElement(By.id("Login")).click();
		//Learn More
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handle= new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(handle.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		
		Shadow dom= new Shadow(driver);
		dom.setImplicitWait(20);
		
		dom.findElementByXPath("//span[text()='Learning']").click();
		
		//snapshot
		//step1-
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		
		//step2-create path
		File dst=new File("./snaps/s.png");
		
		//step3
		FileUtils.copyFile(scr, dst);
		
		
		
		
		WebElement path = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(path).perform();

	}

}
