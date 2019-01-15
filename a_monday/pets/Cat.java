package pets;

public class Cat extends Pet {
	
	@Override
	public void sound() {
		sound="meow";
		System.out.println(sound);
	}

	public Cat() {}
	
	public Cat(String name,String breed,double age,String gender) {
		super(name,breed,age,gender);
	}
	
	private String sound;
	
	public void setSound(String sound) {
		this.sound=sound;
	}
	public String getSound() {
		return sound;
	}

	
}
