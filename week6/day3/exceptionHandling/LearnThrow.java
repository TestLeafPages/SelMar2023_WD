package exceptionHandling;

import org.testng.annotations.Test;

public class LearnThrow {

	
	@Test
	public void createLead() {
		System.out.println("createlead");
throw new RuntimeException("kindly check the lead");
	}
	
	
	@Test(dependsOnMethods={"createLead"})
	public void editLead() {
		System.out.println("editlead");
	}
}
