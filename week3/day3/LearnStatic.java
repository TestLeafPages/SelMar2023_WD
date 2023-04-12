package week3.day3;

public class LearnStatic {

	//vara-static
	static int data=5;
	//vara-non static
	//String  name="Testleaf";
	
	int data1=10;
	
	//static method
	public static void age() {
		data=data+5;

	}
	
	//non static method
	public void sum() {
		/*
		 * System.out.println(data+5); System.out.println(name);
		 * System.out.println(data1+5);
		 */
		
		System.out.println(data1+5);
		
	}
	
	public static void main(String[] args) {
		
		LearnStatic ls=new LearnStatic();
		//static data
		age();
		//15+5
		//20
		
		//non
		ls.sum();
		
		System.out.println("______________");
		LearnStatic ls1=new LearnStatic();
		ls1.sum();
		age();
		
		
	}
	
	
}
