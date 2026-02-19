package com.practicecorejava;

public class Count_digits_in_num {
	
	public static void main(String [] args) {
		
		int num = 56832;
		int count=0;
		
		int temp = num;
		while(temp !=0) {
			 
			 temp = temp/10;
			count ++;
		}
		System.out.println(count);
	}

}
