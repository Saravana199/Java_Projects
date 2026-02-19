package com.oops;

public class object_for_casting {

	public static void main(String[] args) {
	
		Upcasting p1 = new Downcasting("suresh",108,100);
		p1.display();
	
		
		Downcasting d = (Downcasting)p1;
		d.display1();
		d.display();

	}

}
