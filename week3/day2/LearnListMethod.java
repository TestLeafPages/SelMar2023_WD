package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethod {

	public static void main(String[] args) {
//List<wapper class> objectname= new ArrayList<wapper class>();

	//list is create
	List<Integer> idNum= new ArrayList<Integer>();
	
	List<String> mentors= new ArrayList<String>();
	
	//m1-add
	mentors.add("Gokul");
	mentors.add("Ragu");
	mentors.add("Vinoth");
	mentors.add("Gokul");
	
	System.out.println(mentors);
	
	
	
	//m2-size
	int size = mentors.size();
	System.out.println(size);
	
	//m3-index- start from '0'
	mentors.add(1, "Dilip");
	
	System.out.println(mentors);
	
	//m4-get
	
	String string = mentors.get(4);
	System.out.println(string);
	
	//m5-remove
	
		String remove = mentors.remove(1);
		
		System.out.println(remove);
		
	//m9-removeall
		
		mentors.removeAll(mentors);
		
	//m8-contains
	
	boolean contains = mentors.contains("Dilip");
	
	System.out.println("contains : "+contains);
	
	
	System.out.println(mentors);
	
	//m6-clear
	
	mentors.clear();
	
	System.out.println(mentors);
	
	
	//m7-isempty
	
	boolean empty = mentors.isEmpty();
	System.out.println(empty);
	
	
	}

}
