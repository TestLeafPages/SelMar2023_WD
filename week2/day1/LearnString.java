package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		
		//m1= datatype variable= "";--collection pool memory
		
		String name="Test Leaf";
		
		
		//m2--datatype variable= new datatype("");---heap memory
		
		String name1=new String("Testleaf");
		
		
		//m1-length()-method
		int length = name.length();
		System.out.println("length of string : "+length);
		
		//m2-equals
		//== ---it will compare memory address
		if(name==name1) {
			System.out.println("matched");
		}else {
			System.out.println("not  matched");
		}
		
		if(name.equals(name1)) //TestLeaf.equals(TestLeaf)
			{
			System.out.println(".equals-matched");
		}else {
			System.out.println(".equals -not  matched");
		}
		
		
		//m3-equalsingorecase
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("euqlasingorecase- matched");
		}else {
			System.out.println("euqlasingorecase- not match");
		}
		
		//m4-tochararray
		
		String companyName="TestLeaf";
		 char[] ch = companyName.toCharArray();
		//System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		//m5-contains
		boolean contains = name.contains("Te");
		
		System.out.println(contains);
		
		//m6-split
		String nameProduct="a amazon have 1000plus product on dress";
		
		String[] split = nameProduct.split("1000");
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			
		}
	}

}
