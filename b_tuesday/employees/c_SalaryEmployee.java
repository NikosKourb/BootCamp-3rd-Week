package employees;

public class c_SalaryEmployee extends a_Employee implements Payable {
	
	private double salary;

	public c_SalaryEmployee() {}
	
	public c_SalaryEmployee(String n,String s,String id,String ib,String jd,double sal) {
		super(n,s,id,ib,jd);
		this.salary=sal;
	}


	@Override
	public double pay() {
		return salary;
		
	}

	@Override
	public String toString() {
		return "c_SalaryEmployee [salary=" + salary+", Check Ammount="+pay()+"]";
	}


	
	
	
}