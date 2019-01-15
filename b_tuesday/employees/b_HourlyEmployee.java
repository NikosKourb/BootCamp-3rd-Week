package employees;

public class b_HourlyEmployee extends a_Employee implements Payable {
	
	private int hours;
	private double rate;

	public b_HourlyEmployee() {}
	
	public b_HourlyEmployee(String n,String s,String id,String ib,String jd,int h,double r) {
		super(n,s,id,ib,jd);
		this.hours=h;
		this.rate=r;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "b_HourlyEmployee [hours=" + hours + ", rate=" + rate +", Check Ammount="+pay()+"]";
	}

	@Override
	public double pay() {
		return hours*rate;
		
	}
	
	
	
	
	

}
