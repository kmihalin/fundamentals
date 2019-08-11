package kmihalin_lab05;

import java.util.Scanner;

class Rectangle {//Class for a rectangular shape
	private double side1;//Declare variables
	private double side2;

	public Rectangle(double x1, double y1, double x2, double y2) {//Method for a rectangle
		this.side1 = Math.abs(x2 - x1);//Equations for calculating side lengths
		this.side2 = Math.abs(y2 - y1);
	}

	public void scale(double scale) {
		this.side1 = side1*scale;//Equations for scaling rectangle
		this.side2 = side2*scale;
	}

	public void print() {//Method for printing actual rectangle to user
		for (int i = 0; i < side2; i++) {//Rows
			for (int j = 0; j < side1; j++) {//Columns
				if (i==0||j==0||i==(side2-1)||j==(side1-1)) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.print("\n");
		}
	}

}

public class kmihalin_lab05_q3 {
	public static void main(String[] args) {
		
		
		Scanner inputScanner = new Scanner(System.in);//Declare scanner
		char choice = 0;//Declare and initialize user's choice
		boolean option = true;//Declare option for breaking loop
		System.out.println("** Rectangle **");
		System.out.println("Please enter x1: ");//Ask user for x, y values of two points
		double x1 = inputScanner.nextDouble();
		System.out.println("Please enter y1: ");
		double y1 = inputScanner.nextDouble();
		System.out.println("Please enter x2: ");
		double x2 = inputScanner.nextDouble();
		System.out.println("Please enter y2: ");
		double y2 = inputScanner.nextDouble();
		
		Rectangle r = new Rectangle(x1, y1, x2, y2);//Create a new rectangle based on user input
		
		while (option) {//While loop for user options
				System.out.println("a. Scale");
				System.out.println("b. Print");
				System.out.println("c. Exit");
				
				System.out.println("Please enter a choice: ");//Ask user to input a display choice
				choice = inputScanner.next().charAt(0);

			 
			switch(choice) {//Switch statements for user inputs

			case 'a' :
				System.out.println("Please enter a scale: ");//Ask user for a scale value
				double scale = inputScanner.nextDouble();
				r.scale(scale);//Calculate new side lengths based on scale input
				break;

			case 'b':
				r.print();//Print rectangle given user input and/or scale factor
				break;

			case 'c': 
			System.out.println("Goodbye!");//Exit program
			option=false;
			inputScanner.close();//Close scanner
			}
			}
			}
}


