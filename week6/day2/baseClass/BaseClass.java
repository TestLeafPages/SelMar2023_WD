package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcle;



public class BaseClass extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> tldriver= new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		tldriver.set(new ChromeDriver());
		
		//chromedriver driver= new chromedriver();
	}
	
	
	public RemoteWebDriver getDriver() {
		
		return tldriver.get();

	}
	
	//to run in parallel
	//public static ChromeDriver driver;
	
	public String fileName;
	//seq exc
//public static ChromeDriver driver;

	
	@BeforeMethod
	public void precondition() {
		// driver  = new ChromeDriver();
		
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	
	@AfterMethod
	public void postcondition(){
		getDriver().close();
	}
	
	
	@DataProvider(name="fetchData",indices= {2})
	public String[][] sendata() throws IOException {
		
		String[][] readData = ReadExcle.readData(fileName);
		
		return readData;
		
	}

}
