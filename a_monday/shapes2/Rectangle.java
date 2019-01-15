package shapes2;

public class Rectangle extends Shape implements Renderable {
	
	public Rectangle() { 
		super(4);
	}
	
	
	public Rectangle(Point[] p) {
		super(p);
	}
	
	public Rectangle(Rectangle r) {
		super(r);
	}

	public int sideA() {
		return Math.abs(getPoints()[1].getX() - getPoints()[0].getX());
	}
	
	public int sideB() {
		return Math.abs(getPoints()[1].getY() - getPoints()[2].getY());
	}
	
	public double area() {
		return sideA() * sideB();
	}
	
	public double perimeter() {
		return 2 * sideA() + 2 * sideB();
	}
	
	public String toString() {
		return new String("Rectangle with area: " + area() + 
				" and perimeter: " + perimeter());
	}

	@Override
	public void render() {
		for (int i = 1; i <= sideA(); i++)
			System.out.print("*");
		
		System.out.print("\n");
		
		for (int i = 1; i <= sideB() - 2; i++) {
			System.out.print("*");
			for (int j = 1; j <= sideA() - 2; j++)
				System.out.print(" ");
			System.out.print("*");
		}
		
		System.out.print("\n");
		for (int i = 1; i <= sideA(); i++)
			System.out.print("*");
		
		System.out.print("\n");
	}

}
