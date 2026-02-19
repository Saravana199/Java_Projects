package com.oops;

public class String_Operations {
	
	public static void main(String[] args) {
		
		String a = "Sachin";
		String b = "Ramesh";
		String c = "virat rohit SALMAN  ";
		
		int l= a.length();
		System.out.println("length is : " + l);
		
		boolean b1= a.contains("b");
		System.out.println(b1);
		
		String c1 = b.replace("e", "o");
		System.out.println(c1);
		
		char d1= b.charAt(4);
		System.out.println(d1);
		
		String e1 = c.trim();
		System.out.println(e1);
		
		String f1 = c.toUpperCase();
		System.out.println(f1);
		
		String g1= c.toLowerCase();
		System.out.println(g1);
		
		char[] h1 = a.toCharArray();
		System.out.println(h1);
		
		String [] k1 =b.split("m");
		System.out.println(k1[0]);
		System.out.println(k1[1]);
		
		
	}

}
