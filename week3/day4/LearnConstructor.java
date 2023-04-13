package week3.day4;

public class LearnConstructor {

	String empName;
	int empId;
	boolean empStatus;
	
	//default
	public LearnConstructor() {
		
	this("Dilip",24,true);
		
		System.out.println("i am a default constructor");
	}
	
	//parameterized
	
	public LearnConstructor(String empName,int empId,boolean empStatus) {
		
		//realtime ---golbal,local-will same
		this.empName=empName;
		
		this.empId=empId;
		
		this.empStatus=empStatus;
		
		System.out.println("Para-const");
		
		System.out.println(empName+" "+ empId+" "+empStatus);
	}
	
	
	
	public static void main(String[] args) {
		
		
		LearnConstructor le= new LearnConstructor();
		
		System.out.println(le.empName+" "+le.empId+" "+le.empStatus);

		
		
//		LearnConstructor dle= new LearnConstructor("Dilip",20,true);
//		
//		LearnConstructor le1= new LearnConstructor("gokul",21,true);
//		
//		LearnConstructor le2= new LearnConstructor("vinoth",22,true);
//		
		
	}
	
	
	
	
	
	
	
}
