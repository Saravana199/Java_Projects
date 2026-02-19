package com.practicecorejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {
	public static void main(String [] args) {
	
		
		String str = "The mount, is a ,largest : Mountain";
		String mod = str.replaceAll("[,:]","");
		String st = mod.toLowerCase().replace(" ", "");
		System.out.println(st);
	char [] ch =st.toCharArray();
		Set<Character> set = new HashSet<>();
		for(int i=0; i<ch.length;i++) {
			
			if(!set.add(ch[i])) {
			System.out.print( ch[i]);
				
			}
		}
				
		
		
	}
}


