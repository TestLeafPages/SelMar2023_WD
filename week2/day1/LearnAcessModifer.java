package week2.day1;

public class LearnAcessModifer {

	//public
	public void getName() {
		System.out.println("TestLeaf");
	}
	
	//private--inside same class
	private void getNum() {
		System.out.println("12345");
	}
	
	
	//default-inside same package
	void getdata() {
		System.out.println("dilip");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LearnAcessModifer am=new LearnAcessModifer();
		am.getdata();
		am.getName();
		am.getNum();
	}

}
