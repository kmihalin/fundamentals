package kmihalin_lab03;

import java.util.Scanner;

public class kmihalin_lab03_q2 {

	// Method for determining power, given base and exponent
	public static double power(double base, int exponent) {

		// Initiate result
		double result = 1;

		// Loop base until exponent value achieved through result
		for (int i = 1; i <= exponent; i++) {
			result = base * result;
		}
		// Method returns result from loop
		return result;
	}

	// Method for determining factorial given base
	public static int factorial(int N) {

		// Initiate factorial
		int factorial = 1;

		// Loop factorial per iteration
		for (int i = 1; i <= N; i++) {
			factorial = factorial * i;
		}

		// Method returns factorial from loop
		return factorial;
	}

	// Method for sin value given user input in radians
	public static double sin(double radians) {

		// Initiate result and factorial
		double result = 0;
		int N = 10;

		// Given Taylor expansion, compute value of sine given radian value
		for (int i = 0; i <= N; i++) {
			result = result + power(radians, 2 * i + 1) * power(-1, i) / factorial(2 * i + 1);
		}

		// Method returns sine of user value
		return result;
	}

	public static void main(String[] args) {
		// Declare output of calculation and y/n decision variable
		double output;
		char decision = 0;
		// Scanner for user to input values
		Scanner inputScanner = new Scanner(System.in);

		// Ask user for radian value in do-while loop
		do {
			System.out.println("Enter a value to compute the sine: ");
			double userVal = inputScanner.nextDouble();
			output = sin(userVal);

			// Output to console
			System.out.println("The result is " + output);

			// Ask user to continue
			System.out.println("Would you like to continue? (y/n): ");
			decision = inputScanner.next().charAt(0);
		}

		// If user does not continue, program breaks
		while (decision == 'y');
		System.out.println("Goodbye!");

		// Close scanner
		inputScanner.close();
	}
}
