package learnAttributes;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test()
	public void CreateLead() {
		System.out.println("CreateLead");
	}
	
	
	@Test(dependsOnMethods="CreateLead")
	public void editlead() {
		System.out.println("editlead");
	}
	
	@Test(dependsOnMethods="editlead")

	public void Mergelead() {
		System.out.println("Mergelead");

	}
	
	
	@Test()
	public void DeleteLead() {
		System.out.println("DeleteLead");

	}
	
	

}
