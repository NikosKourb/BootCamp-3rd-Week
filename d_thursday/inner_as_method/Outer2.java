package inner_as_method;

public class Outer2 {
	private String a = "Outer2";

	public void doSomething() {
		class Inner2 {
			public void seeOuter() {
				System.out.println(a);
			}
		}
		// instantiation of inner class
		Inner2 i2 = new Inner2();
		i2.seeOuter();
	}

	public static void main(String[] args) {
		Outer2 o2 = new Outer2();
		o2.doSomething();
	}	
}
