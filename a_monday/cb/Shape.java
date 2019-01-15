package cb;

public abstract class Shape {
	private Point [] points; //If was alone it shows null(empty,nothing)BAAAAAD THING
	
	public Shape() { 
		points = new Point[6]; //always have a reference that points somewhere even if not needed
	}
	
	public Shape(Shape p) {}
	
	
	public Shape(Point [] p) {
		points = p;
	}
	
	public Shape(int n) {
		points = new Point[n];
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] p) {
		this.points = p;
	}
	
	public abstract double perimeter();
	
	public abstract double area();
	
}
