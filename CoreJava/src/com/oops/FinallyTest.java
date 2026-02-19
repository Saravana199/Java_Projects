package com.oops;

public class FinallyTest {

	public static void main(String[] args) {
		
		int [] a = new int [3];
		
		
		try {
			a[4] = 8;
		System.out.println("The fourth element is :" + a[4]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
		         System.out.println("Exception thrown  :" + e);
		}
		
		finally{
			
			a[0] = 6;
	         System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");
			
		}
		
		System.out.println("print the line");

	}

}
