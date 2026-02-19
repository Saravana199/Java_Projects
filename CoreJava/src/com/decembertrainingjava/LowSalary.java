package com.decembertrainingjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LowSalary {

	String name;
	int age;
	double salary;
	int minsal = 10000;
	static FileReader fr = null;
	static BufferedReader br = null;
	
	public LowSalary(String name, int age, double salary) {
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
   public void amount() throws LowSalaryException{
		
		if(salary<minsal) {
		
  throw new LowSalaryException(String.format("The salary is a low salary of :" + salary));
            
		}
	}
   
    public static void main(String[] args) {
    	File f = new File("C:\\Users\\sbalajim\\eclipse-workspace\\CoreJava\\src\\com\\decembertrainingjava\\Files\\Input.txt");
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String line;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

try {
	while ((line = br.readLine()) != null) {
	               System.out.println(line);
	           }
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		
	
   
    }
}
