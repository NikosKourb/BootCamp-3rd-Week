package shapes2;

public abstract class Shape {
	private Point [] points;
	
	public Shape() { 
		points = new Point[6];
	}
	
	public Shape(Shape p) {
		Point [] temp  = new Point[p.getPoints().length];
		for (int i = 0; i < p.getPoints().length; i++) {
			temp[i] = new Point(p.getPoints()[i]);
		}
		points = temp;
	}
	
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