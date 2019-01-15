package cb;

public class ShapeMain {

	public static void main(String[] args) {
		
		// create Points
		Point p1 = new Point();
		p1.setX(13);
		p1.setY(6);
		
		Point p2 = new Point();
		p2.setX(7);
		p2.setY(6);
		
		Point p3 = new Point();
		p3.setX(5);
		p3.setY(10);

		Point p4 = new Point();
		p4.setX(8);
		p4.setY(14);
		
		Point p5=new Point();
		p5.setX(12);
		p5.setY(14);
		
		Point p6=new Point();
		p5.setX(15);
		p5.setY(10);
		
		Point[] rect_points = { p1, p2, p3, p4 } ;
		Rectangle r1=new Rectangle(rect_points);
		Rectangle r2=new Rectangle();
		
		Point[] hex_points = {p1,p2,p3,p4,p5,p6} ;
		Hexagon h1 = new Hexagon(rect_points);
		
		Point[] circle_point = { new Point(0, 0) };
		Circle c1 = new Circle(circle_point, 5.3);
		
		
		// declare shape reference and use it for polymorphism
		Shape s = r1;
		System.out.println(s.toString());
		
		s=h1;
		System.out.println(s.toString());
	
		//p_Circle c2=(p_Circle) c1.clone();
		System.out.println(c1.getPoints()[0].getX());
		//c2.getPoints()[0]=new n_Point(0,0);
		System.out.println(c1.getPoints()[0].getX());
		
		//q_Rectangle r2=new q_Rectangle(r1);
		//r2.getPoints[0]setX());
		
		
		s = c1;
		System.out.println(s.toString());
	}
}
