package week4.day3;

public class LearnString {

	public static void main(String[] args) {
		
		String str="Rs. amazon have 1000 @ Different  in shoes"
				+ "dilip";
		//output=1000
//replaceall()
		
		String replaceAll = str.replaceAll("[!^0-9 a-z A-Z]", "");
		System.out.println(replaceAll);
		
		
		//replace()
		
		String replace = str.replace("", "A");
		System.out.println(replace);
		
		//parseInt
		String num="2000";
		int parseInt = Integer.parseInt(num);
		
		System.out.println(parseInt);
		
		
		//upper and lower case
		
		String upperCase = str.toUpperCase();
		
		System.out.println(upperCase);
		
		
		String lowerCase = str.toLowerCase();
		
		System.out.println(lowerCase);
		
		
		String name= "Test Leaf";
		
	//substring()
		
		String substring = name.substring(3);
		System.out.println(substring);
		
		String substring2 = name.substring(2, 7);
		
		System.out.println(substring2);
		
		
		//charAt
		
		char charAt = name.charAt(8);
		
		System.out.println(charAt);
		
		
		
		
		
	}

}
