package com.Test;

public class Postoffice {
	static int currentBalance = 2000;
	public static void greetCustomer(){
		System.err.println("Hello,Welcome to the Postoffice");

	}
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount deposited successfully");
	}
	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount withdran successfully");
	}
	public int getCurrentBalance() {
		return currentBalance;

	}
	public static void main(String[] args) {
		Postoffice postoffice = new Postoffice();
		greetCustomer();
		System.out.println("Current Balance is : "+postoffice.getCurrentBalance());
		postoffice.deposit(500);
		System.out.println("Current Balance is : "+postoffice.getCurrentBalance());
		withdrawal(600);
		System.out.println("Current Balance is : "+postoffice.getCurrentBalance());

	}
}
