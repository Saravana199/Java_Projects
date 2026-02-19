package com.collections;

import java.util.ArrayList;


public class TestMain {
	
public static void main(String [] args) {
        Student s1 = new Student(101, 20, "Alice", 'A');
        Student s2 = new Student(102, 21, "Bob", 'B');
        Student s3 = new Student(103, 19, "Charlie", 'C');
        
        ArrayList<Student> ar = new ArrayList<Student>();
        
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        
        //Collections.sort(ar);
		System.out.println(ar);
}

}
