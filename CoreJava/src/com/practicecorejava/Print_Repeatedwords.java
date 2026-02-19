package com.practicecorejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Print_Repeatedwords {
	
	public static void main(String [] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("sara");
		li.add("Don");
		li.add("Adam");
		li.add("sara");
		li.add("Don");
		li.add("rahul");
		Set<String> dup = new HashSet<>(li);
		System.out.println("After Removing Duplicates: " + dup);
		
		Integer [] a = {1,6,8,4,6,1,5};
		List<Integer> num = Arrays.asList(a);
		Set<Integer> rem = new HashSet<>(num);
		System.out.println("After Removing Duplicates: " + rem);
		
		
		
		
		
	}

}
