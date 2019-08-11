/**
 * 
 */
package kmihalin_lab00;

import java.util.Scanner;

public class kmihalin_lab00_q1 {

	public static void main(String[] args) {
		// Declare integer variables
		int integer1 = 0; // first number to be input by user
		int integer2 = 0; // second number to be input by user
		int result; // variable in which sum will be stored

		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);
		// Ask your TA about this line
		
		System.out.println("Enter an integer:");
		// Prompt; "/n" represents a new line
		
		// Read an integer using the inputScanner variable
		integer1 = inputScanner . nextInt ();
		System.out.println ("Enter a second integer");
		integer2 = inputScanner.nextInt ();
		
		//Compute a value;
		result = integer1 / integer2 * integer1 + integer2;
		
		//Output the result to the console
		System.out.println("The result is:" + Integer.toString(result));
		
		inputScanner.close  ();
		
		
		
	}

}
