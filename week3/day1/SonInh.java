package week3.day1;

public class SonInh extends ParentInh{

	
	public void house() {
		System.out.println("s-2bhk-porur");
	}
	
	public static void main(String[] args) {
		
		
		SonInh s= new SonInh();
		s.house();
		s.ecrHouse();
	s.ownHouse();
		s.ownLand();
	}
}
