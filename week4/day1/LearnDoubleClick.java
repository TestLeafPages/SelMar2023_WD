package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

		driver.switchTo().frame("iframeResult");
		
		WebElement ddc = driver.findElement(By.xpath("//p[contains(text(),'Double')]"));
		
		Actions bulider= new Actions(driver);
		bulider.doubleClick(ddc).perform();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
