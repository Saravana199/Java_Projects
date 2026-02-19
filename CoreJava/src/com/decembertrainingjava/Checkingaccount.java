package com.decembertrainingjava;

public class Checkingaccount extends BankAccount {
	
	public Checkingaccount(int balance, int fee) {
		super(balance, fee);
		
	}

	public void withdraw(int amt) {
		
		balance = balance-(amt + fee);
		System.out.println("the balance amount is :" + balance);
	}

	public static void main(String [] args) {
		
		Checkingaccount bal = new Checkingaccount(1000,10);
		bal.withdraw(200);
		
	}
}
