package com.practicecorejava;

public class Largest_of_three_num {
	
	public static void main(String [] args) {
		
		int a= 12;
		int b= 15;
		int c = 5;
		if(a>b) {
			
			System.out.println(a + "The num is largest");
		}
		
		else if (b>c){
			
			System.out.println(b + "The num is largest");
		}
		
		else if(c>a) {
			System.out.println(c + "The num is largest");
		}
	}

}
