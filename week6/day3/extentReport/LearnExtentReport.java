package extentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		/*
		 * Steps: 
		 * ====== 
		 * 1.Setup Physical report path 
		 * 2.Create object for extentreports
		 * 3.Attach data with physical file
		 * 4.Create a testcase and assigned test details 
		 * 5.Steps level status 
		 * 6.Mandatory step to stop.
		 * ExtentHtmlreporter
               ExtentReports
                 Attach reporter
                     ExtentTest
                         Mediaenititybuilder
		 */
		
		//step-1
		
		ExtentHtmlReporter repo= new ExtentHtmlReporter("./report/result.html");
		
		//if you want save existing resutlt
		repo.setAppendExisting(true);
		
		//step-2
		
		ExtentReports extent=new ExtentReports();
		
		//step-3
		extent.attachReporter(repo);
		
		//step-4
		
		// extent.createTest(testName,desp)
		
		ExtentTest test=extent.createTest("CreateLead", "createLead check with different set of data");
		test.assignAuthor("Dilip");
		test.assignCategory("smoke");
		//step -5
	
		test.pass("Enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/snap1.png").build());
		test.pass("Enter password",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/snap2.png").build());
		test.fail("Cilck on login button");
		
		//--------------------------------------------------------
		
		ExtentTest test1=extent.createTest("EditLead", "EditLead check with different set of data");
		test1.assignAuthor("Gokul");
		test1.assignCategory("gokul");
		
		//step -5
		test1.pass("Enter username");
		test1.pass("Enter password");
		test1.fail("Cilck on login button");
		
		//------------------------------------------------------------------------
		
		ExtentTest test2=extent.createTest("DeleteLead", "DeleteLead check with different set of data");
		test2.assignAuthor("Vinoth");
		test2.assignCategory("vinoth");
		
		
		//step -5
		test2.pass("Enter username");
		test2.pass("Enter password");
		test2.pass("Cilck on login button");
		
		
		//step-6(mandatory)
		extent.flush();
		
		System.out.println("done");
	}

}
