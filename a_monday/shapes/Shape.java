package shapes;

public abstract class Shape {
	
	protected static int n;
	public abstract void perimeter();
	public abstract void surface();

	public Shape() {}
	
	public Shape(int n,double perimeter,double surface) {
	
	}
	
	
	public void setN(int n) {
		this.n=n;
	}
	
	public int getN() {
		return n;
	}
	
	public Point[] point=new Point[getN()];
	public abstract void setN();
	public abstract void setPerimeter();
	public abstract void setSurface();

}
