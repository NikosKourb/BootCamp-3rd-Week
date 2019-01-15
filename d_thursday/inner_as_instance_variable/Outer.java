package inner_as_instance_variable;

public class Outer {
	private int a = 3;
	
	class Inner {
		public void seeOuter() {
			System.out.println("Outer a = " + a);
		}
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.seeOuter();
	}

}
