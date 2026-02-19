package com.practicecorejava;

public class Fibonocci_Series {

	public static void main(String [] args) {
		
		int n=10, firstnum = 0, secondnum = 1, nextnum;
		
		for(int i=1; i<=n; i++) {
			
			System.out.print(firstnum + ",");
			nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
			
		}
		
	}
}
