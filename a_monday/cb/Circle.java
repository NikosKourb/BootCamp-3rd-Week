package cb;

public class Circle extends Shape {
	public static final double PI = 3.14159;
	private double radius;
	
	public Circle() { 
		super(1);
	}
	
	public Circle(Point[] p, double r) {
		super(p);
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double diameter() {
		return 2 * radius;
	}
	
	public double area() {
		return PI * Math.pow(radius, 2);
	}
	
	public double perimeter() {
		return 2 * PI * radius;
	}
	
	public String toString() {
		return new String("Circle with diameter " + diameter() + ", " +
					"area: " + area() + " and perimeter: " + perimeter());
	}
}

