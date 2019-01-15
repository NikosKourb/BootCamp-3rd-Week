package inner_as_interface;

public class InnerAsArgument {

	public static void main(String[] args) {
		Parking p = new Parking();
		
		// anonymous class as argument
		p.parkCar(new Vehicle() {
			public void doSomething() {
				System.out.println("doing something...");
			}
		});
	}
}