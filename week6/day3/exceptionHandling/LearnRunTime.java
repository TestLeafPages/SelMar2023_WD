package exceptionHandling;

public class LearnRunTime {

	public static void main(String[] args) {
		
		int a=10;
		int b=1;
		
		int[] data= {1,3,6,2,5}; //0-4-2=6
		//a/b 10/0
		
		try {
			
			System.out.println("result : " + a/b);
			System.out.println(data[6]);
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(data[9]);
		}
		catch(Exception d) {
			System.out.println(d);
			
		}
		
		finally {
			System.out.println(" end of code");
		}
		
		System.out.println("after finally");
	}
}
