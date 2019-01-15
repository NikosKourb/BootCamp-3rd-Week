package phones;

public abstract class Phone {
	
	String[] allPhones=new String[10];
	private String brand;
	protected double price;
	
	//Default Constructor
	public Phone() {}
	
	//Constructor
	public Phone(String brand) {
		this.brand=brand;
	}
	
	
	//Get-Set BRAND
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	//Get PRICE
	public double getPrice() {
		return price;
	}
	
	//Abstract SetPrice
	public abstract void setPrice();
	
	
	
	

}
