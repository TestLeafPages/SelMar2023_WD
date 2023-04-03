package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//syntax-1
		int data[]= {54,67,89,90,87,90,8,67,34,78,67};
		
		//length-data.length--ctrl+2=L
		//
		int length = data.length;
		System.out.println(length);
		
		//index-[0]-0 to 10
		
		System.out.println(data[9]);//90
		
		//last value
		
		System.out.println("last value: "+data[length-1]);//0 to 10---(11-1)
		
		//print 2nd last value
		
		System.out.println("second last value :" + data[length-2]);
		
		
		//sort v
		
		Arrays.sort(data);//8,34,.....90
		
		//System.out.println(data[0]);//8
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("sorted value inthe array : "+data[i]);
			
		}
		
		//m2
		
		String name[]=new String[3];
		
		name[0]="Dilip";
		name[1]="Ragu";
		//name[2]="Gokul";
		
		
		System.out.println(name[3]);
	

		
	}

}
