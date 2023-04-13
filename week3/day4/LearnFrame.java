package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		
		//index
		
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("Click")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);

		//nested
		
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
	
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		String text = driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
		System.out.println(text);
		
	}

}
