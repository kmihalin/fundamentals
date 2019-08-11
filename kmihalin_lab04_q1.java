package kmihalin_lab04;

import java.util.Scanner;

class Calculator { // Calculator class implements different math functions
	public static double power(double base, int exponent) {// method to calculate power function, calling the base and
															// exponent

		// Declare and initiate result
		double result = 1;

		// Loop base until exponent value achieved through result
		if (exponent > 0) {// when exponent value is positive
			for (int i = 1; i <= exponent; i++) {
				result = base * result;
			}
		} else if (exponent < 0) {// when negative, answer is the reciprocal
			result = 1.0 / result;
		} else if (exponent == 0) {// when zero, answer is 1
			result = 1.0;
		}
		// Method returns result from loop
		return result;
	}

	public static double inverseTangent(double radians, int iterations) {// method to calculate inverse tangent, calling
																			// the angle and number of iterations
		// Initiate result and factorial
		double result = 0;
		iterations = 10;

		// Given Taylor expansion, compute value of inverse tangent given radian value
		for (int i = 0; i <= iterations; i++) {
			result = result + power(radians, 2 * i + 1) * power(-1, i) / (2 * i + 1);
		}

		// Method returns inverse tangent of user value
		return result;
	}

	public static double sin(double radians, int iterations) {// method to calculate sine function, calling the angle
																// and number of iterations
		// Initiate result and factorial
		double result = 0;
		iterations = 10;

		// Given Taylor expansion, compute value of sine given radian value
		for (int i = 0; i <= iterations; i++) {
			result = result + power(radians, 2 * i + 1) * power(-1, i) / factorial(2 * i + 1);
		}

		// Method returns sine of user value
		return result;
	}

	public static double exponential(double exp, int iterations) {// Method to calculate exponential function, calling
																	// the exponent and the number of iterations
		// Declare and initiate result
		double result = 0;

		// Loop exponential for number of iterations to compute sum
		for (int i = 0; i <= iterations; i++) {
			result = result + power(exp, i) * power(-1, i) / factorial(i);
		}

		// Method returns exponential of user value
		return result;

	}

	public static double factorial(int value) {// Method to compute the factorial given a user value
		// Initiate factorial
		int factorial = 1;

		// Loop product of factorial per iteration
		for (int i = 1; i <= value; i++) {
			factorial = factorial * i;
		}

		// Method returns factorial from loop
		return factorial;
	}

	static char displayMenu() {// Method to call the display menu and math function, given input
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("----------------------------\n" + "-- Calculator Application --\n"
				+ "----------------------------\n" + "a. Power Function\n" + "b. Inverse Tangent Function\n"
				+ "c. Sine Function\n" + "d. Exponential Function\n" + "e. Factorial Function\n" + "f. Exit\n"
				+ "----------------------------\n");
		System.out.println("Please enter your choice:");
		char n = inputScanner.next().charAt(0);// Ask user for a math function to compute
		while (n != 'a' & n != 'b' & n != 'c' & n != 'd' & n != 'e' & n != 'f') {// Validate character entered or ask
																					// for a valid option
			System.out.println("Invalid entry! Try again.");
			System.out.println("Please enter your choice:");
			n = inputScanner.next().charAt(0);
		}
		if (n == 'f') {
			inputScanner.close();// End program if "f" is selected
		}
		return n;// return the validated option selected by user

	}

}

public class kmihalin_lab04_q1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		// Declare and initiate variables
		char n;
		double base = 0, radians = 0, exp = 0;
		int exponent = 0, iterations = 0, value = 0;
		do {
			n = Calculator.displayMenu(); // Call display menu and have user enter choice

			if (n == 'a') {// if user inputs "a", ask for base and integer values; output answer calling on
							// method
				System.out.println("Please enter a real number base: ");
				base = inputScanner.nextDouble();
				System.out.println("Please enter an integer exponent: ");
				exponent = inputScanner.nextInt();
				Calculator.power(base, exponent);
				System.out.println("The result is: " + Calculator.power(base, exponent));// output

			}
			if (n == 'b') {// if user inputs "b", ask for radian value and iteration number; output answer
							// calling on method
				System.out.println("Please enter a number in radians: ");
				radians = inputScanner.nextDouble();
				System.out.println("Please enter the number of iterations: ");
				iterations = inputScanner.nextInt();
				Calculator.sin(radians, iterations);
				System.out.println("The result is: " + Calculator.sin(radians, iterations));// output to user
			}
			if (n == 'c') {// if user inputs "b", ask for radian value and iteration number; output answer
							// calling on method
				System.out.println("Please enter a number in radians: ");
				radians = inputScanner.nextDouble();
				while (radians < -1 || radians > 1) {// if radian value is out of domain, ask user for new input
					System.out.println("Invalid entry for the radian value! Please try again.");
					System.out.println("Please enter a number in radians: ");
					radians = inputScanner.nextDouble();
				}
				System.out.println("Please enter the number of iterations: ");
				iterations = inputScanner.nextInt();
				Calculator.inverseTangent(radians, iterations);
				System.out.println("The result is: " + Calculator.inverseTangent(radians, iterations));// Output to user
			}
			if (n == 'd') {// if user inputs "d", ask for exponential value and iteration number; output
							// answer calling on method
				System.out.println("Please enter a number for the exponential: ");
				exp = inputScanner.nextDouble();
				System.out.println("Please enter the number of iterations: ");
				iterations = inputScanner.nextInt();
				Calculator.exponential(exp, iterations);
				System.out.println("The result is: " + Calculator.exponential(exp, iterations));// Output to user

			}
			if (n == 'e') {// if user inputs "e", ask for a positive integer value; output answer calling
							// on method
				System.out.println("Please input a positive integer: ");
				value = inputScanner.nextInt();
				Calculator.factorial(value);
				System.out.println("The result is: " + Calculator.factorial(value));// Output to user
			}

		} while (n != 'f');// If user enters "f", program ends and goodbye statement is output
		System.out.print("------------------------------\n" + "Goodbye!\n" + "------------------------------");

		inputScanner.close();// close the scanner
	}

}
