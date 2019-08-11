package kmihalin_lab04;

 abstract class Shape { // Superclass for a general shape

	protected int numberOfSides; //Declare variable for the number of sides to be considered

	protected abstract void setNumberOfSides(int num); //template for when user enters number of sides

	protected abstract int getNumberOfSides(); //template for output when number of sides is entered

	protected double sideLength; //Declare variable for the side length

	protected abstract void setSideLength(double length);//template for when user enters side length

	protected abstract double getSideLength();//what to return when user enters side length for shape

	public abstract double computeArea();//method for computing the area

	public abstract double computePerimeter();//method for computing the perimeter

}

	class Square extends Shape {//Subclass square for superclass shape
	private int numberOfSides=4;//Declare and initialize variables
	
	private double sideLength;
	
	public Square(double length)//Set constructor
	{
		this.sideLength = length;//Declare inputed value as member variable		
	}
	
	public double computeArea()//Compute area of square calling on inherited value
	
	{
		return sideLength*sideLength;//returns output
	}
	public double computePerimeter()//Compute perimeter of square calling on inherited values; returns output
	{
		return numberOfSides*sideLength;//returns output
	}

	//Set and get inputs for number of sides, which is 4
	protected void setNumberOfSides(int num) {
		this.numberOfSides = num;
	}


	protected int getNumberOfSides() {
		return this.numberOfSides;
	}

	//Set and get side length value
	protected void setSideLength(double length) {
		this.sideLength = length;
	}

	protected double getSideLength() {
		return this.sideLength;
	}
	
}

public class kmihalin_lab04_q3 {

	public static void main(String[] args) {
		Square s = new Square(3.6);//Declare new square 
		System.out.println("The area of the square is: " + s.computeArea());//computed area for new square from Square class
		System.out.println("The perimeter of the square is: " + s.computePerimeter());//computed perimeter for new square from Square class
	}

}

