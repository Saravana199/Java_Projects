package com.practicecorejava;

public class All_arithmetic_Operations {
	
	public static void main(String [] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3=0;
		double res;
		
		
		switch (num3) {
		
		case 1:
			 res = num1 + num2;
			 System.out.println("The addition of two numbers is" + res);
			 break;
		case 2:
			res = num2 - num1;
			 System.out.println("The Subtraction of two numbers is" + res);
			 break;
		case 3:
			res = num2 * num1;
			 System.out.println("The Multiplication of two numbers is" + res);	
			 break;
		case 4:
			res = num2 / num1;
			 System.out.println("The Division of two numbers is" + res);	 
			 break;
			 
		default:
            System.out.println("There is no operator");
		}
	}

}
