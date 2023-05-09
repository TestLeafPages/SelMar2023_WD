package challenges;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ScrollDown {
	@Test
	public void upload() throws IOException {

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement eleUpload = driver.findElement(By.id("resumeUpload"));
		
		driver.executeScript("arguments[0].scrollIntoView();", eleUpload);
		driver.executeScript("arguments[0].click();", eleUpload);
}
}
