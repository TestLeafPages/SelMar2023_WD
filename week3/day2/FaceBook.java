package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		List<String> name= new ArrayList<String>();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		//47
		System.out.println("total links :"+size);
		
//		WebElement data1 = links.get(3);
//		//System.out.println(data1);
//		String text = data1.getText();
//		System.out.println(text);
		
		
		for (int i = 0; i <size; i++) {
			String allLink = links.get(i).getText();

			name.add(allLink);
			
		}
		Collections.sort(name);
		System.out.println(name);
	}

}
