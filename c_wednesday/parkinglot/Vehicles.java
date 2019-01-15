package parkinglot;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vehicles {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
	private String lplate;
	private String brand;
	private String model;
	private String color;
	private int parkSpot;
	private String entranceTime;


	public Vehicles() {}
		
	public Vehicles(String lp,String b,String m,String c) {
		this.lplate=lp;
		this.brand=b;
		this.model=m;
		this.color=c;
		this.parkSpot=parkSpot;
		this.entranceTime=entranceTime;
	}
	
	//Method that initializes the Array
	public static String[][] vehiclesAll=new String[10][2];
	
	public static void InitializeArray() {
	for(int r=0;r<vehiclesAll.length;r++)	{
		vehiclesAll[r][0]="VACANT";
		for(int c=1;c<vehiclesAll[0].length;c++) {
			vehiclesAll[r][c]="-----";
			}
		}
	}
	
	//Method that Shows the Array
	public static void ShowAllArray() {
		
		for(int r=0;r<vehiclesAll.length;r++)	{
			System.out.print("[  ");
			for(int c=0;c<vehiclesAll[0].length;c++) {
				System.out.print(vehiclesAll[r][c]);
				for(int d=c;d<(vehiclesAll[0].length)-1;d++) {
					try {
						for(int w=0;w<(16-(vehiclesAll[r][c].length()));w++) {
							System.out.print("-");
							}
						
						}
					catch(Exception e) {
						}
					}
				}
			System.out.print("  ]");
			System.out.println();
		}
	}

	public String EntranceTime() {
		Timestamp tEntrance = new Timestamp(System.currentTimeMillis());
		String entranceTime = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(tEntrance);
		return entranceTime;
	}
	
	public long EntranceTimeMill() {
		Timestamp tEntrance = new Timestamp(System.currentTimeMillis());
		long entranceTimeMill=tEntrance.getTime();
		return entranceTimeMill;
		
	}
	
	public String ExitTime() {
		Timestamp tExit = new Timestamp(System.currentTimeMillis());
		String exitTime = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(tExit);
		return exitTime;
	}
	
	public long ExitTimeMill() {
		Timestamp tExit = new Timestamp(System.currentTimeMillis());
		long exitTimeMill=tExit.getTime();
		return exitTimeMill;
		
	}
	
	public double TimeStayed() {
		double exitTimeMin=ExitTimeMill()/60000;
		double entranceTimeMin=EntranceTimeMill()/60000;
		double timeStayed=exitTimeMin-entranceTimeMin;
		return timeStayed;
	}

	public String getLplate() {
		return lplate;
	}

	public void setLplate(String lplate) {
		this.lplate = lplate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getParkSpot() {
		return parkSpot;
	}

	public void setParkSpot(int parkSpot) {
		this.parkSpot = parkSpot;
	}
	

	public abstract String toString();
	public abstract double pay(); 
	
	
}
