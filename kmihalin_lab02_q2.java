package kmihalin_lab02;

import java.util.Scanner;

public class kmihalin_lab02_q2 {

	public static void main(String[] args) {
		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// Information and program mission
		System.out.println("------------------------------");
		System.out.println("Name: Keeana Mihalin");
		System.out.println("Lab 02");
		System.out.println("Date: Oct. 16, 2018");
		System.out.println("Question 2");
		System.out.println("------------------------------");

		// User inputs an integer number for the number of loop iterations
		System.out.println("Enter an integer number for the number of loop iterations: ");
		int num = inputScanner.nextInt();

		// User must input positive integer
		while (num < 0) {
			System.out.println("Enter an integer number for the number of loop iterations: ");
			num = inputScanner.nextInt();
		}

		// Declare variables
		int i = 1, min = 0, max = 0, countEven = 0, countOdd = 0;
		double sum = 0;

		while (i <= num) {
			// User inputs an integer
			System.out.println("Enter integer " + i + ": ");
			int var = inputScanner.nextInt();
			// Calculation for mean
			sum = sum + var;
			double mean = sum / i;
			// First iteration integer is both max and min
			if (i == 1) {
				min = max = var;
			}
			// Determine which inputed integer is the max/min
			if (var > max) {
				max = var;
			} else if (var < min) {
				min = var;
			}
			// Count number of even/odd entries
			if (var % 2 == 0) {
				int even = 1;
				countEven = countEven + even;
			} else {
				int odd = 1;
				countOdd = countOdd + odd;
			}
			// Output to user
			System.out.println("The mean of " + i + " input(s) is: " + mean);
			System.out.println("Max value: " + max);
			System.out.println("Min value: " + min);
			System.out.println("Even count: " + countEven);
			System.out.println("Odd count: " + countOdd);
			System.out.print("\n");
			i++;
		}
		// End program and close scanner
		System.out.println("Goodbye!");
		inputScanner.close();
	}
}