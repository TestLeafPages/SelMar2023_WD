package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	//to run in parallel
	public ChromeDriver driver;
	
	//seq exc
//public static ChromeDriver driver;

	
	@BeforeMethod
	public void precondition() {
		 driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	
	@AfterMethod
	public void postcondition(){
		driver.close();
	}
}
