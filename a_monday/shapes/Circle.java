package shapes;

public class Circle extends Shape {
	
	public static final double pi=3.14159;
	private double radius;
	private double perimeter;
	private double surface;

	public Circle() {}
	
	public Circle(double radius,double perimeter,double surface) {
		super(n,perimeter,surface);
	}
	public Circle(int n,double perimeter,double surface) {
		super(n,perimeter,surface);
	}
	
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	
	@Override
	public void setN() {
		this.n=1;
	}

	@Override
	public void setPerimeter() {
		this.perimeter=2*pi*getRadius();
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	@Override
	public void setSurface() {
		this.surface=pi*(Math.pow(getRadius(), 2));
	}
	public double getSurface() {
		return surface;
	}
	
	public String toString() {
		return new String("The Circle's Perimeter= "+getPerimeter()+"\n"+"And the Circle's Surface= "+getSurface());
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surface() {
		// TODO Auto-generated method stub
		
	}

}
