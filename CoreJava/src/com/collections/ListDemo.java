package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListDemo {
	
public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10); // Integer
		al.add('a');
		al.add(10.78);
		al.add(2, "sachin");
		al.add('a');
		
		System.out.println(al);
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("Ramesh");
		li.add("is a");
		li.add("Good boy");
		li.add("Studies well");
		li.add("Ramesh");
		li.remove(3);
		
		System.out.println(li);
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(4);
		hs.add(8);
		hs.add(2);
		hs.add(4);
		System.out.println(hs);
	}

}
