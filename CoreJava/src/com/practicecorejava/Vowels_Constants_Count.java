package com.practicecorejava;

public class Vowels_Constants_Count {
	
	public static void main(String[] args) {
	
	String str = "vivomobilecompan#$$^%&y";
	char[] ch = str.toCharArray();
	
	int size = ch.length;
	int vowels=0;
	int constants =0;
	int specialchar = 0;
	int i=0;
	
while(i != size) {
	
	if(ch[i] >='a' && ch[i]<='z') {
		if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u') {
			++vowels;
			
		}
		else {
			++constants;
		}
	}
		else {
			
			++specialchar;
		}
	++i;
	}

System.out.println("The vowels count is :" + vowels );
System.out.println("The constants count is :" + constants);
System.out.println("The specialchar count is :" + specialchar);
}
}

