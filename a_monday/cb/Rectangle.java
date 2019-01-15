package cb;

import java.util.Scanner;

public class Rectangle extends Shape implements t_Renderable{
	
	@Override
	public void Render() {
		// TODO Auto-generated method stub
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

	public Rectangle() { 
		super(4);
	}
	
	public Rectangle(Point[] p) {
		super(p);
	}
	//Copy Constructor
	public Rectangle(Rectangle r) {}///works only if the variable types are primitive(in that case not)
	//creates shallow copy by pointing at the same reference as the rectangle that you set
	//so any changes done to the original are made to the new one.
	
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
	
	public void copyRect(Rectangle r) {
		
		Rectangle c=new Rectangle();
		//for(int i=0;i<4;i++) {
		//c.getPoints()[i].getX()=((r.getPoints()[i].getX()-1)+1);
		//r.getPoints()[i].getY()=((r.getPoints()[i].getY()-1)+1);
		}
		
		/*
		String str2="";
		for(int i=0;i<4;i++) {
			String str=r.getPoints()[i].getX()+" "+r.getPoints()[i].getX();
			str2=str2+str;
		}
		Scanner sc=new Scanner(str2);
		for(int i=0;i<8;i++) {
			Double.parseDouble(sc.next());
		}
		System.out.print(" ");
	}
	*/
	
	public String toString() {
		return new String("Rectangle with area: " + area() + 
				" and perimeter: " + perimeter());
	}
}
