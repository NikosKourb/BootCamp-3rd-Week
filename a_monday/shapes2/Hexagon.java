package shapes2;

public class Hexagon extends Shape {

	public Hexagon() {
		super(6);
	}

	public Hexagon(Point[] p) {
		super(p);
	}

	@Override
	public double perimeter() {
		return 6 * side();
	}

	@Override
	public double area() {
		return ((3 * Math.sqrt(3)) / 2) * Math.pow(side(), 2);
	}
	
	public int side() {
		return Math.abs(getPoints()[1].getX() - getPoints()[0].getX()); 
	}
	
	public String toString() {
		return new String("Hexagon with area: " + area() + 
				" and perimeter: " + perimeter());
	}

}