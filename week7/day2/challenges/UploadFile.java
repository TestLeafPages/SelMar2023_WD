package challenges;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

	@Test
	public void upload() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	
		  String path = System.getProperty("user.dir"); //project path
		 
		 System.out.println(path);
		 

		  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		  //Absolute path of the file
		  driver.findElement(By.id("resumeUpload")).sendKeys(path+"\\data\\Rahul_Fresher_Sample_Resume.pdf"); // absolute path
		 
		  
	}
}
