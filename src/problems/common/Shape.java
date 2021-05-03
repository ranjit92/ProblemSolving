package problems.common;

abstract class Shape {

	String color;
	
	Shape(String color){
		this.color = color;
	}
	
	public abstract double getArea();
	public abstract String toString();
	
	public String getColor() {
		return this.color;
	}
	
}

class Circle extends Shape{
	
	double r;
	Circle(String color, double r){
		super(color);
		this.r = r;
	}
	
	public double getArea() {
		return Math.PI * (r*r); 
	}
	public String toString() {
		return "Circle having color "+ super.getColor()+" and Area "+ getArea();
	}
} 





