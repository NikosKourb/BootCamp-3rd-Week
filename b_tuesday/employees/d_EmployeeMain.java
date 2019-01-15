package employees;

import java.util.Scanner;

public class d_EmployeeMain {

	public d_EmployeeMain() {}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		a_Employee h1;
		System.out.print("Are you Hourly(h) or a Salary(s) Employee :");
		String choice1=sc.next();
		
		if(choice1.equals("h")) {

			System.out.print("What is your Name :");
			String n=sc.next();
			System.out.print("What is your Surname :");
			String s=sc.next();
			System.out.print("What is your id numer :");
			String id=sc.next();
			System.out.print("What is your Insurance Body :");
			String ib=sc.next();
			System.out.print("What is your Job Description :");
			String jd=sc.next();
			System.out.print("How many hours have you worked :");
			int h=sc.nextInt();
			System.out.print("What is your Hourly Rate :");
			double r=sc.nextDouble();
			
			h1=new b_HourlyEmployee(n,s,id,ib,jd,h,r);
			System.out.print(h1.toString());
			
		}
		else {
			System.out.print("What is your Name :");
			String n=sc.next();
			System.out.print("What is your Surname :");
			String s=sc.next();
			System.out.print("What is your id numer :");
			String id=sc.next();
			System.out.print("What is your Insurance Body :");
			String ib=sc.next();
			System.out.print("What is your Job Description :");
			String jd=sc.next();
			System.out.print("How much is your Salary");
			double sal=sc.nextDouble();
			
			h1=new c_SalaryEmployee(n,s,id,ib,jd,sal);
			System.out.print(h1.toString());
			
		}
		
	}

}
