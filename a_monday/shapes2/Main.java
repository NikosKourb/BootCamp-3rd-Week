package shapes2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		// create Points
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(5);

		Point p2 = new Point();
		p2.setX(5);
		p2.setY(5);

		Point p3 = new Point();
		p3.setX(5);
		p3.setY(2);

		Point p4 = new Point();
		p4.setX(1);
		p4.setY(2);

		Point p5 = new Point(3, 4);
		Point p6 = new Point(6, 1);

		Point[] rect_points = { p1, p2, p3, p4 };
		Rectangle r1 = new Rectangle(rect_points);

		Point[] circle_point = { new Point(0, 0) };
		Circle c1 = new Circle(circle_point, 5);

		Point[] hex_points = { p1, p2, p3, p4, p5, p6 };
		Hexagon h1 = new Hexagon(hex_points);

		// declare shape reference and use it for polymorphism
		Shape s = r1;
		System.out.println(s.toString());

		s = c1;
		System.out.println(s.toString());

		s = h1;
		System.out.println(s.toString());

		// rectangle implements render
		r1.render();

		// deep vs shallow copy
		Circle c2 = (Circle) c1.clone();
		System.out.println(c1.getPoints()[0].getX());
		c2.getPoints()[0] = new Point(0, 0);
		System.out.println(c1.getPoints()[0].getX());

		Rectangle r2 = new Rectangle(r1);
		r2.getPoints()[0].setX(0);

		System.out.println(r1);
		System.out.println(r2);
	}
}
