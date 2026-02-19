package com.practicecorejava;

import java.util.HashSet;
import java.util.Set;

public class Remove_Dupchar {
	
	public static void main(String [] args) {
		
		String str = "schoool";
		Set<Character> rem = new HashSet<>();
        for (char ch : str.toCharArray()) {
           rem.add(ch); // duplicates will be ignored automatically
        }
       StringBuilder result = new StringBuilder();
        for(char c : rem) {
        	result.append(c);
        }
        System.out.println("After Removing Duplicates: " + result.toString());
	}

}
