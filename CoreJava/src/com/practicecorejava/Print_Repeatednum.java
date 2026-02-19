package com.practicecorejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Print_Repeatednum {
	
	public static void main (String [] args) {
		
		int [] a = {1,6,8,4,6,1,5};
		int count =0;
		Set<Integer> duplicate = new HashSet<>();
		for(int i=0; i<a.length;i++) {
			if(!duplicate.add(a[i])) {
				System.out.println("Duplicate elements are" +a[i]);
				count++;
				System.out.println("The Duplicate elements count are" + count);
			}
		}
		List<String> li = new ArrayList<String>();
		li.add("sara");
		li.add("Don");
		li.add("Adam");
		li.add("sara");
		li.add("Don");
		li.add("rahul");
		
		List<String> dup = li.stream().distinct().toList();
		System.out.println(dup);
	}
}
	
	
	//"sara", "sachin","rahul",

