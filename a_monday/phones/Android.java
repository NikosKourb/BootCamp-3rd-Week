package phones;

public class Android extends Phone{

	public Android() {}
	
	public Android(String brand) {
		super(brand);
	}
	
	@Override
	public void setPrice() {
		super.price=199.99;
	}
	
	public String toString() {
		return new String("Android model= "+getBrand()+" ,price="+getPrice());
	}

}
