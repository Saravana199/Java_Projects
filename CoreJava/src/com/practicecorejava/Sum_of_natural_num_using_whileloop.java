package com.practicecorejava;

public class Sum_of_natural_num_using_whileloop {

	public static void main(String[] args) {
		int num = 10;
		int sum = 0,i=1;
		while(i<=num) {
			
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of all numbers is :" + sum);

	}

}
