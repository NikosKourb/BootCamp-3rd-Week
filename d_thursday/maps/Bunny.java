package maps;

public class Bunny {
	private int number;
	private String name;
	
	public Bunny(int n) {
		number = n;
	}
	
	public Bunny(int no, String n) {
		number = no;
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void hop() {
		System.out.println("Bunny " + number + " hop");
	}
}
