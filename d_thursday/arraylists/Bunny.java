package arraylists;

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
}
/*
	private static List<Bunny>bunnyList=new ArrayList<Bunny>();



	public Bunny() {
		for(int j=0;j<15;j++) {
			Bunny b=new Bunny();
			bunnyList.add(b);
			
		}
	}
		
	public String hop() {
		String str1="";
		String str2="";
		for(int k=0;k<bunnyList.size();k++) {
		str1=bunnyList.get(k)+" "+k+" hops,";
		str2=str2+str1;
		}
		return str2;
	}
	
	

	public static void main(String[] args) {
		
		Bunny b1=new Bunny();
		
		try{System.out.println(b1.hop());}
		catch(Exeption e){

	}

}
*/