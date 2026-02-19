package com.decembertrainingjava;

public class Employeemanagement {
	
	String name;
	int salary;
	String department;
	//String [] employees = {"akash","aravind","charlie","bob"};
	public void employeedata() {
	Object [] []employees = new Object[3][3];
	//employee1
	employees[0][0]= "akash";
	employees[0][1]= 50036;
	employees[0][2]= "Testing";
	
	//employee2
	employees[1][0]= "aravind";
	employees[1][1]= 40200;
	employees[1][2]= "Development";
	
	//employee3
	employees[2][0]= "bob";
	employees[2][1]= 10200;
	employees[2][2]= "Support";
	}
	public Employeemanagement(String name,int salary,String department) {
		
		this.name= name;
		this.salary=salary;
		this.department=department;
		
	}
	
	public void sortsalary() {
		
		if(salary>50000) {
			
			System.out.println("This is a high paid employee :" + name); 
		}
		else if(salary>40000) {
			
			System.out.println("This is a medium paid employee :" + name);
		}
		
       else if(salary>20000) {
			
			System.out.println("This is a average paid employee :" + name);
		}
       else {
    	   System.out.println("This is a low paid employee :" + name);
       }
		
	   }
	
	
	
	

}
