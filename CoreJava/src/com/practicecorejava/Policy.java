package com.practicecorejava;

public class Policy {
	
	int  premium;
	double taxrate;
	double discount;
	
	public Policy(int premium,double taxrate,double discount) {
		this.premium = premium;
		this.taxrate = taxrate;
		this.discount = discount;
		
	}
	public void original() {
		double org = premium -discount;
		System.out.println("The original discount amount is :" + org);
		
	}
    
	public void netPayable() {
		
		double total = (premium - discount) + (premium - discount) * taxrate;
		System.out.println("The total payable amount is :" + total);
		
	}
	
	public static void main(String[] args) {
		Policy amt = new Policy(2500,0.18,125);
		amt.original();
		amt.netPayable();
		
		
	}
	

}
