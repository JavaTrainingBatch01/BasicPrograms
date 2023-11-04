package com.Test;

public class Bank {


	static int currentBalance = 2000;
	public static void greetCustomer() {
		System.out.println("Hello Wellcome to the banking application");
	    
	}
	public static void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited successfully");
		
	}

	public static void withdral(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is Withdrawn successfully");
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("Current Balance is : "+bank.getCurrentBalance());
		deposit(1000);
		System.out.println("Current Balance is : "+bank.getCurrentBalance());
		withdral(400);
		System.out.println("Current Balance is : "+bank.getCurrentBalance());
		deposit(500);
		System.out.println("Current Balance is : "+bank.getCurrentBalance());
		withdral(600);
		System.out.println("Current Balance is : "+bank.getCurrentBalance());
		deposit(700);
		System.out.println("Current Balance is : "+bank.getCurrentBalance());
	}
}


