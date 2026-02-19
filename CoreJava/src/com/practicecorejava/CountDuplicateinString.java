package com.practicecorejava;

public class CountDuplicateinString {
	
	public static void main(String [] args) {
		
		String str = "automation is";
		int count =0;
		int count1=0;
		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					System.out.println("The duplicate letters are :" + ch[j]);
					count ++;
				}
			}
		}
		System.out.println("The duplicate letters count are :" + count);
		
		for(int i=0;i<ch.length;i++) {
			count1 ++;
		}
		System.out.println("The total letters count are :" + count1);
	}

}
