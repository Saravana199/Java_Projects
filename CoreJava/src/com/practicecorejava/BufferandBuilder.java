package com.practicecorejava;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class BufferandBuilder {
	
	public static void main(String [] args) {
		
		String str ="saravana";
		StringBuilder result = new StringBuilder(str);
		StringBuilder rev= result.reverse();
		System.out.println(rev);
		
		String str1 = "Automation is the key to Automation";
		int count =0;
		String [] seperate = str1.split(" ");
		Set<String> li = new HashSet<>();
		for(int i=0;i<seperate.length;i++) {
			if(!li.add(seperate[i])) 
			{
					System.out.println("the duplicate letter is :" + seperate[i]);
					System.out.println("the length of duplicate letter is :" + seperate[i].length());
					count++;
				}
			
		}
		System.out.println("the duplicate letter count is :" + count);
	}

}
