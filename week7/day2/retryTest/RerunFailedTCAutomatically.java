package retryTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunFailedTCAutomatically implements IRetryAnalyzer{

	int count=0;
	//0,1
	public boolean retry(ITestResult result) {
		if(count<2) {
			System.out.println(count);
			count++;
			
			return true;//test failed again this will help to rerun again
		}
		return false;//test passed it will stop your execute
	}

}
