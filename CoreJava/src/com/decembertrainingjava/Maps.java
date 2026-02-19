package com.decembertrainingjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Maps {
	
	public Map<String, Integer> datagiven() {
	
	Map<String,Integer> student = new HashMap<String,Integer>();
	
	student.put("ram",74);
	student.put("john",86);
	student.put("ramesh",65);
	student.put("lokesh",52);
	student.put("aarav",44);
	System.out.println(student);
	return student;
	}
	
	public void sorting(Map<String,Integer> student) {
		

            if (student == null || student.isEmpty()) {
            System.out.println("No data");
            return;
        }

        // Highest score (max by value)
        Entry<String, Integer> highest = student.entrySet()
                .stream()
                .max(Entry.comparingByValue())
                .orElse(null);

        // Lowest score (min by value)
        Entry<String, Integer> lowest = student.entrySet()
                .stream()
                .min(Entry.comparingByValue())
                .orElse(null);

        System.out.println("Highest: " + highest.getKey() + " = " + highest.getValue());
        System.out.println("Lowest : " + lowest.getKey()  + " = " + lowest.getValue());

		
		
	}
	
	
	public static void main(String[] args) {
		
		Maps ma = new Maps();
		Map<String, Integer> data = ma.datagiven();
		ma.sorting(data);
	}
		
		
		
	

}
