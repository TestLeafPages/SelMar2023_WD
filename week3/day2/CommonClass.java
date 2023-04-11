package week3.day2;

public class CommonClass extends HDFCHQ {

	public void withDrawLimit() {
System.out.println("10L");		
	}

	@Override
	public void savePlan() {
System.out.println("9%-5yrs");		
	}
	
	public void goldloan() {
		System.out.println("goldloan");
		
	}
	public static void main(String[] args) {
		CommonClass cc=new CommonClass();
		
		cc.withDrawLimit();
		cc.knowYourCustomer();
		cc.fd();
		cc.rd();
		cc.savePlan();
		cc.eduLoan();
		cc.homeLoan();
		
		
		
		
		
		
		
	}

	

}
