package pets;

public abstract class Pet {

	public Pet() {}
	
	public Pet(String name,String breed,double age,String gender) {
	}

	private String name;
	private String breed;
	private double age;
	private String gender;
	public abstract void sound();
	
	//NAME
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	//BREED
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}
	
	//AGE
	public void setAge(double age) {
		this.age=age;
	}
	public double getAge() {
		return age;
	}
	
	//GENDER
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}

	
	//SOUND
	/*
	public void setSound(String sound) {
		this.sound=sound;
	}
	public String getSound() {
		return sound;
	}
	*/
}
