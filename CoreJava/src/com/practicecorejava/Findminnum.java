package com.practicecorejava;

public class Findminnum {
	
	public static void main(String [] args) {
		
		int [] a = {10,40,80,25,96,72};
		int min = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("the min num is" + min);
	}

}
