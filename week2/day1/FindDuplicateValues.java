package week2.day1;

public class FindDuplicateValues {

	public static void main(String[] args) {
		
		int num[]= {23,56,78,45,23,34,67,34,67};
		//23,34,67
		//num[0]=23--num[1]=56
		for (int i = 0; i < num.length; i++) {
			
			//num[1]=56
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println("its duplicate values:"+ num[i]);
				}
			}
		}

	}

}
