package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement scr = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		
		WebElement dst = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		
		
		Actions bulider=new Actions(driver);
		
		bulider.dragAndDrop(scr, dst).perform();
		
		
		//drag-and-drop-by
		
		//Drag and Drop
		WebElement ddby = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		
		bulider.dragAndDropBy(ddby, 200, 0).perform();
		
	}

}
