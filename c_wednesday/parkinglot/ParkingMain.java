package parkinglot;

import java.util.Scanner;

public class ParkingMain {
	
	//public static String[] vehiclesAll=new String[25];

	public ParkingMain() {}

	public static void main(String[] args) {
		
		String answer=null;
		
		do {
			Vehicles v1 = null;
			v1.InitializeArray();
			v1.ShowAllArray();
			
			/*Vehicles car=new Cars();
			car*/
		
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("What do you want to do :"+"");
		
		if(sc.next().equals("e")) {
			System.out.println("What kind of vehicle do you have ? "+"\n"+"1.Motorcycle"+"\n"+"2.Car");
			String choice=sc.next();
			if(choice.equals("1")) {
				
				
				/*Vehicles v1=new Motors();
				System.out.println("Give me your license plate: ");
				v1.setLplate(sc.next());
				System.out.println("Give me your brand: ");
				v1.setBrand(sc.next());
				System.out.println("Give me your model: ");
				v1.setModel(sc.next());
				System.out.println("Give me your color: ");
				v1.setColor(sc.next());
				
				v1.EntranceTime();
				v1.EntranceTimeMill();*/
				
			}
			
			
			
		}

		
		
		
		
		
		
		System.out.print("Do you want to continue inputing Vehicles (y/n): ");
		answer=sc.next();

	}while(answer.equals("y"));
	}
}
