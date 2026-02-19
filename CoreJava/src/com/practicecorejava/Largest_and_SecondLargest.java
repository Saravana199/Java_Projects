package com.practicecorejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Largest_and_SecondLargest {
	public static void main(String [] args) {
	int [] a = {13,26,4,8,42,31,72,6,8};
	int max = a[0];
	int secondmax = a[0];
	
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			
		    secondmax=max;
			max=a[i];
			
		}
	/*	else if(a[i]>secondmax && max !=secondmax ) {
			
			secondmax=a[i];
		} */
	}
System.out.println(max);
System.out.println(secondmax);
int min =Arrays.stream(a).min().getAsInt();
System.out.println(min);

List<Integer> list = new ArrayList<Integer>();
for(int num : a) {
	list.add(num);
}
System.out.println(list);
}
}