package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToElement {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		
		
		WebElement scroll = driver.findElement(By.xpath("//ul[contains(@class,'containerHome')]/h6"));
		
		Actions bulider= new Actions(driver);
		
		bulider.scrollToElement(scroll).perform();
		
		
	}
	

}
