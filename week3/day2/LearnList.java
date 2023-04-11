package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/link.xhtml");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		//47
		System.out.println("total links :"+size);
		
		WebElement data1 = links.get(1);
		System.out.println(data1);
		String text = data1.getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("How many links in this page?")).click();
		
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
		int size1 = links1.size();
		//79
		System.out.println("total links1 :"+size1);
		
		WebElement data2 = links1.get(3);
		System.out.println(data2);
		String text1 = data2.getText();
		System.out.println(text1);

		driver.close();
	}

}
