package week1.day1;

public class Vehicle {

	//type methodname-> ctrl+ space
	
	public void applyBreak() {
		System.out.println("i applybreak");
	}
	
	public void soundHorn() {
		System.out.println("i press soundhorn");
	}
	
	public void accelerate() {
	
	}
	
	
	public int regNumber() {
		return 5624;
		
	}
	
	
	public int add(int a, int b) {
		return a+b;
		
	}
	
	public String name() {
		return "Testleaf";
		
	}
	
	public static void main(String[] args) {

//classname objname= new classname();
		
		Vehicle car=new Vehicle();
		
		//objname.method()
		
		car.applyBreak();
		car.soundHorn();
		
		//ctrl +2 ->local --m1
		int regNumber = car.regNumber();
		System.out.println(regNumber);
		
		//m2
		System.out.println(car.regNumber());
		
		//m1
		String name = car.name();
		
		System.out.println(name);
		
		//m2
		System.out.println(car.name());
		
		
		
	}

}
