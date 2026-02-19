package com.decembertrainingjava;

public class SortArray {
	public static void main(String [] args) {
	int [] a = {2,10,5,83,50,225,92,106};
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) { 
			

			 if (a[j] < a[i]) {
			            
			            int temp = a[i];//
			            a[i] = a[j];//
			            a[j] = temp;//
			 }

		}
	}

for (int x : a) {
    System.out.print(x);
}

	}

}
