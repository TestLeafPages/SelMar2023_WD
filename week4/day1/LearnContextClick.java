package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnContextClick {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rc = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		
		
		Actions bulider= new Actions(driver);
		bulider.contextClick(rc).perform();
		
		
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
