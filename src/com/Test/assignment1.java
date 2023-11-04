package com.Test;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting number:");
		int startingNumber = scanner.nextInt();
		
		System.out.println("Enter the Ending number:");
		int endingNumber = scanner.nextInt();
		int number = startingNumber;
		while (number <=endingNumber) {
			if(number%2==0)
			System.out.println(number);
			number++;
		}
     scanner.close();
	}

}
