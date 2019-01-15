package parkinglot;

public class Cars extends Vehicles implements Payable {

private final double rate=2;
	
	public Cars() {}
	
	public Cars(String lp,String b,String m,String c,int parkSpot,String entranceTime,String exitTime) {
		super(lp,b,m,c);
	}

	@Override
	public double pay() {
		
		double priceTicket=TimeStayed()*rate;

		return priceTicket;
	}

	@Override
	public String toString() {
		return "Parking Spot= "+getParkSpot()+"\n"+"Vehicle Type= Motorcycle"+"\n"+
	"License Plate= "+getLplate()+"\n"+"Brand= "+getBrand()+"\n"+"Color= "+getColor()+"\n"+
	"Entrance Time= "+EntranceTime()+"\n"+"Exit Time= "+ExitTime()+"\n"+"Price= "+pay();
	}
	
		

}