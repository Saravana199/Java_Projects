package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("Akshay");
		li.add("Don");
		li.add("Adam");
		li.add("Akash");
		li.add("Ram");
		
		long cout1= li.stream().filter(s->s.startsWith("A")).count();
		System.out.println(cout1);
		
		long count2= Stream.of("Akshay","Don","Adam","Akash","Ram").filter(s->s.startsWith("A")).count();
		System.out.println(count2);
		
		li.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}

}
