package com.oops;

public class TestMain {
	
public static void main(String[] args) {
		
		System.out.println("*****Employee******");
		
		Employee1 e1=new Employee1();
		System.out.println(e1);  //e1.toString();
		System.out.println("Total Salary"+e1.calculateSalary());
		
		System.out.println("*****Manager******");
		
		Manager m1=new Manager(102,"Sameer",30000,1200,1300,4000);//
		System.out.println("Total Salary "+m1.calculateSalary());
		System.out.println(m1.toString());
		
		System.out.println("*****MarketingExce******");
		MarketingExce me1 = new MarketingExce(104,"ramesh",100,200,300,400);
		System.out.println("Total Salary "+me1.calculateSalary());
		System.out.println(me1.toString());
		
		
		
	}

}
