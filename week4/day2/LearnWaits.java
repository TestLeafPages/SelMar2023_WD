package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//WebElement text =driver.findElement(By.xpath("//span[text()='I am here']")) ;
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(6));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		String text2 = until.getText();
		System.out.println(text2);
		
		//visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']")))
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement inv = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		
		
		WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(3));
		Boolean until2 = wait1.until(ExpectedConditions.invisibilityOf(inv));
		
		System.out.println(until2);
}
		
		
		
		
		
		
		
	}


