package baseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcle;



public class BaseClass extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> tldriver= new ThreadLocal<RemoteWebDriver>();
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testCase,testDescripition,testAuthor,testcategory;
	
	
	
	public void setDriver(String browser) {
		
			if (browser.equalsIgnoreCase("chrome")) {
				tldriver.set(new ChromeDriver());}
			else if (browser.equalsIgnoreCase("edge")) {
				tldriver.set(new EdgeDriver());
			}
		
	}
	
	
	public RemoteWebDriver getDriver() {
		
		return tldriver.get();

	}
	
	
	public String fileName;


	@Parameters({"browser"})
	@BeforeMethod
	public void precondition(String browser) {
		
		
		setDriver(browser);
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
	
	
	@BeforeSuite
	public void startReport() {
        ExtentHtmlReporter repo= new ExtentHtmlReporter("./report/result.html");
		
		repo.setAppendExisting(true);
		
		 extent=new ExtentReports();
		
		extent.attachReporter(repo);
	}
	
	@BeforeClass
	public void testDetails() {
		test=extent.createTest(testCase, testDescripition);
		test.assignAuthor(testAuthor);
		test.assignCategory(testcategory);
	}
	
	public void reportStep(String message,String status) throws IOException  {
		if(status.equalsIgnoreCase("pass")) {
			test.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}
	}
	
	public int takeSnap() throws IOException {
		int random = (int)(Math.random()*999999);
		File scr=getDriver().getScreenshotAs(OutputType.FILE);
		File des= new File("./snap/img"+random+".png");
		FileUtils.copyFile(scr, des);
		
		return random;
	}
	
	

	
	@AfterSuite
	public  void stopReport() {
		extent.flush();
	}
	
	
	

}
