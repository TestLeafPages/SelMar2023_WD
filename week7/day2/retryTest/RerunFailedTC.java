package retryTest;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class RerunFailedTC {

	@Test(retryAnalyzer=RerunFailedTCAutomatically.class)
	public void createLead() {
		System.out.println("CreateLead");
		
	}
	
	@Test(retryAnalyzer=RerunFailedTCAutomatically.class)
	public void editLead() {
		System.out.println("editLead");
		throw new NoSuchElementException();
	}
	
	@Test(retryAnalyzer=RerunFailedTCAutomatically.class)
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	
}
