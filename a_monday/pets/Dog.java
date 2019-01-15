package pets;

public class Dog extends Pet{
	
	@Override
	public void sound() {
		sound="woof";
		System.out.println(sound);
	}
	
	public Dog() {}
	
	public Dog(String name,String breed,double age,String gender) {
		super(name,breed,age,gender);
	}
		
		private String sound="woof";
		
		public void setSound(String sound) {
			this.sound=sound;
		}
		public String getSound() {
			return sound;
		}

	}
