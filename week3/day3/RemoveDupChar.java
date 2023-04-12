package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupChar {

	public static void main(String[] args) {
		//TestLaf
		String data="TestLeaf";
		
		
		char[] ch = data.toCharArray();
		Set<Character> name=new TreeSet<Character>();
		Set<Character> name1=new TreeSet<Character>();
		String output="";
		
		
		  for (Character c : ch) { 
			 if(name.add(c)) {
			  output=output+c;
			 }
		  }

		System.out.println(output);
		
		
		

	}

}
