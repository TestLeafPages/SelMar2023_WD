package week3.day2;

public class HDFCBank implements RBI,RBI2 {

	public void withDrawLimit() {
		System.out.println("limit per day -5L");
		
	}

	public void knowYourCustomer() {
		System.out.println("pan and aadhar");
		
	}

	public void fd() {
		
		System.out.println("fb-4.5% for 6month");
	}
	
	private void goldLoan() {
		System.out.println("7%");
	}
	
	
	public static void main(String[] args) {
		//RBI rbi= new RBI();
		
		HDFCBank hdfc= new HDFCBank();
		hdfc.fd();
		hdfc.goldLoan();
		hdfc.knowYourCustomer();
		hdfc.withDrawLimit();
		hdfc.homeLoan();
	}

	public void homeLoan() {
		System.out.println("6%");
	}

	public void rd() {
		System.out.println("5%");
		
	}

	public void goldloan() {
		// TODO Auto-generated method stub
		
	}
	

}
