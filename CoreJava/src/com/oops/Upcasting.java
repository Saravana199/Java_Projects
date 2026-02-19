package com.oops;

public class Upcasting {
	
	String name;
	int id;
	
	public Upcasting (String name, int id) {
		
		this.name= name;
		this.id= id;
	}
	
	public void display() {
		
		System.out.println("The name is : " + name + "The ID is :" + id);
	}

}
