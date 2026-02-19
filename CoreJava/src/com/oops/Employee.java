package com.oops;

public class Employee {
	
	String name;
	Address address;

	public Employee(String n,Address address) {
		
		this.name =n;
		this.address = address;
	}
	
	public static void main(String [] args) {
		Address add = new Address(1,"chennai","tamilnadu",05);
		Employee emp = new Employee("saravana", add);
		System.out.println("the employee name is:" + emp.name);
		System.out.println("the address is :" + emp.address.street_no + emp.address.city + emp.address.state + emp.address.pin);
		
	}
}
