package kmihalin_lab00;

import java.util.Scanner;

public class kmihalin_lab00_q3 {

	public static void main(String[] args) {
		// Declare integer variables

		double x1 = 0, x2 = 0, y1 = 0, y2 = 0, side1 = 0, side2 = 0, hypotenuse = 0, perimeter = 0;

		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// First value to enter by user
		System.out.println("Enter a value for x1");
		x1 = inputScanner.nextInt();
		System.out.println("Enter a value for x2");
		// Second value to enter by user
		x2 = inputScanner.nextInt();
		// Third value to enter by user
		System.out.println("Enter a value for y1");
		y1 = inputScanner.nextInt();
		// Fourth value to enter by user
		System.out.println("Enter a value for y2");
		y2 = inputScanner.nextInt();

		// Calculation of side 1
		side1 = x2 - x1;
		// Calculation of side 2
		side2 = y2 - y1;

		// Calculation of hypotenuse
		hypotenuse = Math.sqrt(side1 * side1 + Math.pow(side2, 2.0));

		// Output to console
		perimeter = side1 + side2 + hypotenuse;
		System.out.println("The perimeter of the right triangle is " + Double.toString(perimeter) + ".");

	}

}
