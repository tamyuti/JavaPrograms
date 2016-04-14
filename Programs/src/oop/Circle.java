package oop;

public class Circle extends Shape implements ShapeConstants {
	public double radius;
	
	public Circle(){
		noOfSides=0;
	}
	public double calulateArea(){
		return pi*(radius)*(radius);	
	}
	public double calculatePerimeter(){
		return 2*pi*radius;
	}
	
	public void setSides(int noOfSides) {
		this.noOfSides=noOfSides;
		
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.radius=-2;
		System.out.println("Perimeter "+c.calculatePerimeter());
		System.out.println("Area "+c.calulateArea());
		
	}
	
	
}
