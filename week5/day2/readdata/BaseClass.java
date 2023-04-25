package readdata;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
//chr dr=new 
	public String fileName;
	public RemoteWebDriver driver ;
	
	@Parameters({"browser","username","password","url"})
	
@BeforeMethod
public void precondition(String browser,String uName,String Pwd,String url) {
	
if(browser.equalsIgnoreCase("chrome")) {
	 driver  = new ChromeDriver();
}else if(browser.equalsIgnoreCase("edge")) {
	driver= new EdgeDriver();
}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(Pwd);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}




@AfterMethod
public void postcondition() {
	driver.close();

	
}

@DataProvider(name="fetchData")
public String[][] sendata() throws IOException {
	
	String[][] readData = ReadExcle.readData(fileName);
	
	return readData;
	
}





}
