package com.practicecorejava;

public class ArmstrongNum {
	
	public static void main(String [] args) {
		
		int num = 378, rem=0,sum=0;
		int temp = num;
		while(temp!=0) {
			
			rem = temp%10;
			sum = sum+(rem*rem*rem);
			temp=temp/10;
		}
		
		if(sum == num) {
			
			System.out.println("the number is armstrong num");
		}
		else {
			System.out.println("the number is not a armstrong num");
		}
	}

}
