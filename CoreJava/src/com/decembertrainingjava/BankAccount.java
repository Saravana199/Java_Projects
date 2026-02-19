package com.decembertrainingjava;

public class BankAccount {
	
	int fee = 0;
	int balance;
	
	public  BankAccount(int balance,int fee) {
		
		
		this.balance = balance;
		this.fee = fee;
	}
	
	public void withdraw(int amt) {
		
		balance = balance-(amt + fee);
	}

}
