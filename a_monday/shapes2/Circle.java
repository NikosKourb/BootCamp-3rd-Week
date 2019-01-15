package shapes2;

public class Circle extends Shape implements Cloneable {
	public static final double PI = 3.14159;
	private int radius;
	
	public Circle() { 
		super(1);
	}
	
	public Circle(Point[] p, int r) {
		super(p);
		this.radius = r;
	}
	
	public int getRadius() {
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}