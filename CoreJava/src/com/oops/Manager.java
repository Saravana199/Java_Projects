package com.oops;


	public class Manager extends Employee1 //id name salary
	{
	     double food_allowance;
	     
	   /*  public Manager()
	     {
	    	 //super() calls parent class default constructor
	    	 super(102,"Sameer",30000,1300,1000);
	    	 food_allowance=1200;
	     }*/
	  /*   public Manager(double food_allowance)
	     {
	    	 super(102,"Sameer",30000,1300,1000);
	    	 this.food_allowance=food_allowance;
	     }*/
	     public Manager(int id,String name,double salary,double HRA,double DA,double food_allowance)
	     {
	    	super(id,name,salary,HRA,DA);
	    	this.food_allowance=food_allowance;
	     }
	     
	     public double calculateSalary()
	     {
	    	 return salary+HRA+DA+food_allowance;
	     }
	     public String toString()
		  {
			  return id+" "+name+" "+salary+" "+food_allowance;
		  }
	}


