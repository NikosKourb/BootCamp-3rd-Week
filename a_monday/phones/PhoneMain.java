package phones;

public class PhoneMain {

	public PhoneMain() {

	}

	public static void main(String[] args) {
		
		Phone p1=new Android("Xiaomi");
		p1.setPrice();
		System.out.println(p1.getPrice());// or p1.price
		System.out.println(p1.toString());
		
		p1=new iPhone("Apple S9");
		p1.setPrice();
		System.out.println(p1.getPrice());// or p1.price
		System.out.println(p1.toString());

	}

}
