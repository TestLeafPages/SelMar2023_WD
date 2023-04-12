package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		int[] num= {1,2,4,56,67,56,34,78,67,7};
		
		Set<Integer> unq= new LinkedHashSet<Integer>();
		Set<Integer> dup= new LinkedHashSet<Integer>();

for (Integer i : num) {
	boolean add = unq.add(i);
	if(!add) {
		dup.add(i);
	}
}
		System.out.println(unq);
		System.out.println(dup);
		
		//convert set into list
		List<Integer> getData=new ArrayList<Integer>(unq);
		Integer data = getData.get(1);
		System.out.println("data iscoming list -:"+data);
		//56
		
		
		//convert list into set
	}

}
