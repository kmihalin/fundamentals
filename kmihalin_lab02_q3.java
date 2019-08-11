package kmihalin_lab02;

import java.util.Scanner;

public class kmihalin_lab02_q3 {

	public static void main(String[] args) {
		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// Information and program mission
		System.out.println("------------------------------");
		System.out.println("Name: Keeana Mihalin");
		System.out.println("Lab 02");
		System.out.println("Date: Oct. 16, 2018");
		System.out.println("Question 3");
		System.out.println("------------------------------");

		// Declare variables
		int i = 1, num = 1;
		double factorial = 1;

		// User inputs an integer number to calculate factorial
		System.out.println("Input an integer number to calculate its factorial: ");
		num = inputScanner.nextInt();

		// User must input positive integer
		while (num < 0) {
			System.out.println("Invalid Entry! Please enter a positive integer: ");
			num = inputScanner.nextInt();
		}
		// Set result for 0! to be 1
		if (num == 0) {
			System.out.println("The resulting factorial is: 1");
		}

		// Loop to calculate factorial
		for (i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		// Output factorial to user
		System.out.println("The resulting factorial is: " + factorial);

		// Close scanner
		inputScanner.close();
	}

}
