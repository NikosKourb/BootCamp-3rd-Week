package parkinglot2;

public abstract class Vehicle {
	
	private String lPlate;
	private String VBrand;
	private String VModel;
	private String VColor;
	private int parkSpot;
	private String entranceTime;	
	
	
	public Vehicle(String lp,String vB,String vM,String vC,int pS,String eT) {
		this.lPlate=lp;
		this.VBrand=vB;
		this.VModel=vM;
		this.VColor=vC;
		this.parkSpot=pS;
		this.entranceTime=eT;
	}
	
	//Set-Get for LICENCE PLATE
	public void setLPlate(String lp) {
		this.lPlate=lp;	
	}
	public String getLPlate() {
		return lPlate;
	}
	
	//Set-Get for BRAND
	public void setBrand(String vB) {
		this.VBrand=vB;
	}
	public String getBrand() {
		return VBrand;
	}
	
	//Set-Get for MODEL
	public void setVModel(String vM) {
		this.VModel = vM;
	}
	public String getVModel() {
		return VModel;
	}
	
	//Set-Get for VCOLOR
	public void setVColor(String vC) {
		this.VColor = vC;
	}
	public String getVColor() {
		return VColor;
	}

	//Set-Get for PARK SPOT
	public void setParkSpot(int pS) {
		this.parkSpot = pS;
	}
	public int getParkSpot() {
		return parkSpot;
	}

	//Set-Get for ENTRANCE TIME
	public void setEntranceTime(String eT) {
		this.entranceTime = eT;
	}
	public String getEntranceTime() {
		return entranceTime;
	}

	
	public abstract void price();

	

}
