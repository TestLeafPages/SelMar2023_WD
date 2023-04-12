package week3.day3;

public class LearnThis extends ParentClass{

	public void age() {
		System.out.println("34");
		super.age();
		
	}
	int  data=5;
	public void sum(int data) {
		this.data=data;
		System.out.println(data);
	}
	
	
	
	public static void main(String[] args) {
		LearnThis lt= new LearnThis();
		lt.age();
		
	}
}
