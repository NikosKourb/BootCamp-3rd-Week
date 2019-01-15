package cb;

public class Hexagon extends Shape{

	public Hexagon() {
		super(6);	
	}
	
	public Hexagon(Point[] p) {
		super(p);
	}
	
	public double sideA() {
		return Math.sqrt((Math.pow((getPoints()[1].getX() - getPoints()[0].getX()),2))+(Math.pow((getPoints()[1].getY() - getPoints()[0].getY()),2)));
	}
	public double perimeter() {
		return sideA()*6;
	}
	public double area() {
		return Math.pow(sideA(),2)*((3*Math.sqrt(3))/2);
	}
	
	public String toString() {
		return new String("Hexagon with area: " + area() + 
				" and perimeter: " + perimeter());
	}

}
