package cb;

public class MainEquals {

	public MainEquals() {}

	public static void main(String[] args) {
		
		Bunny b1=new Bunny(1,"Bunny1");
		Bunny b2=new Bunny(2,"Bunny2");
		Bunny b3=new Bunny(1,"Bunny1");
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		
	}
}
