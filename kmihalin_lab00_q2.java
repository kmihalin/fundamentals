package kmihalin_lab00;

public class kmihalin_lab00_q2 {

	public static void main(String[] args) {
		//Declare integer variables
		double x1 = 1, y1 = 2, x2 = 4, y2 = 7, side1 = 0, side2 = 0, distance = 0;

		// Calculation for side 1
		side1 = x2 - x1;

		// Calculation of side 2
		side2 = y2 - y1;

		// Calculation for distance
		distance = Math.sqrt(side1 * side1 + Math.pow(side2, 2.0));

		// Output to console
		System.out.println("The distance between points (" + Double.toString(x1) + "," + Double.toString(y1) + ") and ("
				+ Double.toString(x2) + "," + Double.toString(y2) + ") is " + Double.toString(distance));

	}

}
