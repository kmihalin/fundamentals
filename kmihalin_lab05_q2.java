package kmihalin_lab05;

class Shape { //Superclass for any shape
	private int numberOfSides;//declare variables
	private double sideLength;

	protected void setNumberOfSides(int num) {//Set variable
		this.numberOfSides = num;
	}

	protected int getNumberOfSides() {//Declare what to return
		return this.numberOfSides;
	}

	protected void setSideLength(double length) {//Set second variable
		this.sideLength = length;
	}

	protected double getSideLength() {//State what to return for second variable
		return this.sideLength;
	}

}

class Square extends Shape {//Class for a square shape
	public Square(double side) {//Set parameters for a square, calling on superclass
		super.setNumberOfSides(4);
		super.setSideLength(side);
	}

	public double computeArea() {//Method for area of a square output to user
		System.out.println("Calling superclass computeArea");
		return ((super.getSideLength()) * (super.getSideLength()));
	}

	public double computePerimeter() {//Method for perimeter of a square output to user
		System.out.println("Calling superclass computePerimeter");
		return (super.getNumberOfSides() * super.getSideLength());
	}

}

class Circle extends Shape {//Class for a circle shape
	public Circle(double sideLength) {//Define parameters for a circle, assuming side length is equal to a circle's diameter
		super.setSideLength(sideLength);
		super.setNumberOfSides(0);
	}

	public double computeArea() {//Method for area of a circle output to user
		System.out.println("Calling superclass computeArea");
		return (Math.PI * Math.pow(super.getSideLength(), 2) / 4);
	}

	public double computePerimter() {//Method for perimeter of a circle output to user
		System.out.println("Calling superclass computePerimeter");
		return (Math.PI * super.getSideLength());
	}
}

public class kmihalin_lab05_q2 {
	public static void main(String[] args) {
		Square s = new Square(3.6);//Set side length of a new square
		System.out.println("The area of the square is: " + s.computeArea());//Output area and perimeter to user
		System.out.println("The perimeter of the square is: " + s.computePerimeter());
	}
}