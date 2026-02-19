package com.oops;

public class Employee1 //extends Object
       
           {
	
	
	
	    protected int id;
	    protected String name;
	    protected double salary,HRA,DA;
	    
	    public Employee1()
	    {
	    	id=101;
	    	name="Sachin";
	    	salary=20000;
	    	HRA=500;
	    	DA=500;
	    }
	    
		public Employee1(int id, String name, double salary,double HRA,double DA)
		{
			
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.HRA=HRA;
			this.DA=DA;
			
		}
		public double calculateSalary()
		{
			return salary+HRA+DA;
		}
	 
		  public String toString()
		  {
			  return id+" "+name+" "+salary;
		  }
	    
	}


