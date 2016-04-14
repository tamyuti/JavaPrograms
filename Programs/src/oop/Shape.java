package oop;

public abstract class Shape {
	
		public int noOfSides;
		public float area;
		public float perimeter;

		public void setSides(int noOfSides){
			this.noOfSides=noOfSides;
		}

		public double calulateArea(){
			return area;	
		}
		public double calculatePerimeter(){
			return area;
	}


}
