package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println(text);
		
		
		////div[@class='ui-datatable-scrollable-body']/table/tbody/tr
		

		String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).getText();
		System.out.println("to print 1 row values :"+data);
		
		
		List<WebElement> data1 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr/td[1]"));
		
		int col = data1.size();
		
List<WebElement> data2 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[1]/td"));
		
		int row = data2.size();
		
		
		
		for (int i = 1; i <=col; i++) {
			
		for(int j=1;j<=row ;j++) {
		String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr["+i+"]/td["+j+"]")).getText();
		System.out.println(text2);
		}
	}
		
		for (int i = 1; i <=col; i++) {
			String text3 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr["+i+"]/td")).getText();
			System.out.println(text3);
			
			//chr[i]
		}
	}

}
