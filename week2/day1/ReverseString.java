package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		//declare
		//convert into tocaharray
		//for loop
		String data="Amazon"; //nozamA
		char[] ch = data.toCharArray();
		
//1-10--0to9--(-1)
		for (int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			//nozam
		}
	}

}
