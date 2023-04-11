package week3.day1;

public class LearnMethodOverLoading {

	
	public void add() {
		int a=9,b=9;
		
		System.out.println(a+b);
	}
	
	public void  add(int a,int b,String name) {
		int c;
		c= a+b;
		System.out.println(c+" "+ name);
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public String name() {
		return "TestLeaf";
		
	}
	
	public String name(String f,String l) {
		return f+" "+ "\n"+l;
		
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading ov= new LearnMethodOverLoading();
		
		
		ov.add();
		ov.add(78, 78, "Dilip");
		int add = ov.add(76, 78, 9);
		System.out.println(add);
		
		System.out.println(ov.name());
		System.out.println(ov.name("test", "leaf"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
