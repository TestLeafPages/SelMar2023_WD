package week3.day2;

public abstract class HDFCHQ  implements RBI2,RBI{

	public void homeLoan() {
		System.out.println("homeloan");
		
	}

	public void knowYourCustomer() {
		System.out.println("kyc");
		
	}

	public void fd() {
		
		System.out.println("fd");
	}

	public void rd() {
		
		System.out.println("rd");
		
	}
	
	//unimpl---keyword -abstract
	public abstract void savePlan();
	
	//impl
	public void eduLoan() {
		System.out.println("educ");
		
	}
	
//	public static void main(String[] args) {
//		HDFCHQ hq= new HDFCHQ();
//	}
}
