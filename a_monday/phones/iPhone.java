package phones;

public class iPhone extends Phone{

		public iPhone() {}
		
		public iPhone(String brand) {
			super(brand);
		}
		
		@Override
		public void setPrice() {
			super.price=999.99;
		}
		
		public String toString() {
			return new String("iPhone model= "+getBrand()+" ,price="+getPrice());
		}

	}