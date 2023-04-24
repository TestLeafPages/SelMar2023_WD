package staticdata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

//step-1 create a method to the pass data with @dataprovider
	
//step-2 in the annotation create name value

	//step-3 declare 2D string array inside method 
	//how many row number &column number
	//in array index will start from '0'
	//row 3=0,1,2
	//column 4=0,1,2,3
	
	//step4- return data
	
	@DataProvider(name="fetchData")
	public String[][] sendata() {
		
		String[][] data=new String[3][4];
		
		data[0][0]="TestLeaf";
		data[0][1]="vinoth";
		data[0][2]="s";
		data[0][3]="098768976";
		
		data[1][0]="TestLeaf";
		data[1][1]="gokul";
		data[1][2]="j";
		data[1][3]="878478782";
		
		data[2][0]="TestLeaf";
		data[2][1]="raghu";
		data[2][2]="r";
		data[2][3]="98085789";
		
		return data;
	}
	
	
	//step-5 in @test(attribute="Name")
	@Test(dataProvider="fetchData")
	
	//step 6-create input args inside method
	public void runCreateLead(String cName,String fName,String lName,String PhNo ) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		

	}
	
	

}
