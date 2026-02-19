package com.oops;

public class MarketingExce extends Employee1 {

	
	double target_allowance;
	
	public MarketingExce (int id,String name,double salary,double HRA,double DA,double target_allowance) {
		
		super(id,name,salary,HRA,DA);
		
		this.target_allowance = target_allowance;
		
	}
	
	public double calculateSalary()
    {
   	 return salary+HRA+DA+target_allowance;
    }
	
	public String toString()
	  {
		  return id+" "+name+" "+salary+" "+target_allowance;
	  }
}
