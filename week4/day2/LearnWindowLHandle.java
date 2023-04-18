package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowLHandle {

	public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);//focus parent
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		System.out.println("*************************");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		//System.out.println(windowHandles);
		
		for (String eachWindow : windowHandles) {
			System.out.println(eachWindow);
		}
		
		
		List<String>allLinks=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(allLinks.get(1));
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		
		
		driver.findElement(By.xpath("//label[text()='E-mail Address']/following::input")).sendKeys("dilip@testleaf");

		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		driver.close();
		
		driver.switchTo().window(allLinks.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	}

}
