package pets;

public class PetMain {

	public PetMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Pet p;
		
		
		Cat c=new Cat("Name","Blue",3,"male");
		c.sound();
		
		Dog d=new Dog("Name","Red",3,"female");
		d.sound();
		
		/*
		p=c;
		p.sound();
		
		p=d;
		p.sound();
		
		*/
		//a_Pet p1;
		//p1=new c_Dog();
		
		//System.out.println(p1.getSound());

	}

}
