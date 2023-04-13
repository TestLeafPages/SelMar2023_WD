package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		
		//syntax-driver.swtichTo().alert()
		
		Alert click = driver.switchTo().alert();
		
		//simple
		click.accept();
		
		String text = driver.findElement(By.id("simple_result")).getText();
		
		System.out.println(text);
		
		Thread.sleep(5000);
		
		
		//confrim
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		click.dismiss();
		
String text1 = driver.findElement(By.id("result")).getText();
		
		System.out.println(text1);
		
		Thread.sleep(5000);

		
		//prompt
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		click.sendKeys("TestLeaf");
		click.accept();
		
String text2 = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(text2);
		
		
		
		
		//sweet-
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();


	}

}
