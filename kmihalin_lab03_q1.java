package kmihalin_lab03;

import java.util.Scanner;

public class kmihalin_lab03_q1 {
	public static double computePower(double base, int power) {
		// Declare variables
		double result = 1;
		int absolutePower = power;

		// Take absolute value of power
		if (power < 0) {
			absolutePower = power * -1;
		}

		// Calculation for exponent
		for (int i = 1; i <= absolutePower; i++) {
			result = base * result;

		}

		// Calculation if power is a negative value
		if (power < 0) {
			// For negative exponent, must invert
			result = 1.0 / result;
		}

		// Result if power is equal to zero
		else if (power == 0) {
			result = 1;
		}

		// Method returns value from loop
		return result;
	}

	public static void main(String[] args) {

		// Set new scanner
		Scanner inputScanner = new Scanner(System.in);

		// Ask user for base and power values
		System.out.println("Please enter a real number base: ");
		double base = inputScanner.nextDouble();
		System.out.println("Please enter an integer exponent: ");
		int power = inputScanner.nextInt();
		double result = computePower(base, power);

		// Output to console
		System.out.println("The result is: " + result);

		// Close scanner
		inputScanner.close();

	}

}
