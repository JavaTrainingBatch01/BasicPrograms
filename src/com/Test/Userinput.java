package com.Test;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		      
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hai,How are you?");
		String status = scanner.nextLine();
		System.out.println("what  is your age");
		int age = scanner.nextInt();
		System.out.println("Thanks for the information");

	}

}
