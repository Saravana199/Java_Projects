package com.oops;

public class Downcasting extends Upcasting {
	
	double salary;
	
	public Downcasting(String name, int id,double salary) {
		
		super(name,id);
		this.salary=salary;
	}
	
public void display1() {
		
		System.out.println("The name is : " + name + "The ID is :" + id + "Salary is: " + salary);
	}

}
