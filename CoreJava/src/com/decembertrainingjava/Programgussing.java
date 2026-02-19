package com.decembertrainingjava;

public class Programgussing {
	
	public static void main(String [] args) {
		
		int min=1, max=100;
		int guess = 98;
		
		if(guess==min) {
			
			System.out.println("the gussed num is:" + min);
		}
		
		else if(guess==max) {
			
			System.out.println("the gussed num is:" + max);
		}
		
		else{
			for(int i=2; i<=max;i++) {
				if(guess==i) {
					
					System.out.println("the gussed num is:" + i);
				}
			}
		}
	}

}
