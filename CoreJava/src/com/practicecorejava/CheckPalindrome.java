package com.practicecorejava;

public class CheckPalindrome {
	
	public static void main(String [] args) {
		String str = "madam";
		String reverse="";
		for(int i =str.length()-1;i>=0;i--) {
			reverse = reverse +str.charAt(i);
		}
		System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
		
	}
	

}
