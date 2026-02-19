package com.practicecorejava;

public class Find_MaxNum {
	
	public static void main(String[] args) {
		
		int a []= {15,30,45,10,20,30,40,50,60};
		
		int max = a[0];
		
		for(int i=1; i<a.length;i++) {
			
			if(max<a[i]) {
					
					max= a[i];
					
					
				}
				
			}
		System.out.println("the max num is" + max);
		}
	}


