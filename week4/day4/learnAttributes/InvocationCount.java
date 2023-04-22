package learnAttributes;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=4,threadPoolSize=2,invocationTimeOut=500)
	public void testCase() {
		System.out.println("testCase");
	}
}
