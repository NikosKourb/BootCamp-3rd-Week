package cb;

public class Bunny {
	
	private int number;
	private String name;
	
	public Bunny(int n) {
		number=n;
	}
	
	public Bunny(int no,String n) {
		number=no;
		name=n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void hop() {
		System.out.println("Bunny "+number+" hops");
		
	}
	
	@Override
	public boolean equals(Object arg) {
		if(arg==this)//compares the two reference point to the same object
		return true;
		if(arg==null)
		return false;
		if(getClass()!=arg.getClass())//compares the classes of the two objects if they are equal
		return false;
		Bunny bunny=(Bunny) arg;//converts(via the Casting method) the object that belongs to the Bunny Class 
		                        //to the same class in order to do the following comparisons
		return (name==bunny.name||name!=null&&name.equals(bunny.name))&&(number==bunny.number);
	}
	
}
