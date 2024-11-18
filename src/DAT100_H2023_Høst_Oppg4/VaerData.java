package DAT100_H2023_Høst_Oppg4;

public class VaerData {
	
	private double temperatur;
	private double nedbor;
	private double vindstyrke;

	public VaerData(double temperatur, double nedbor, double vindstyrke) {
		
		this.temperatur = temperatur;
		this.nedbor = nedbor;
		this.vindstyrke = vindstyrke;
	}

	//Getters and setters
	public double getTemperatur() {
		return temperatur;
	}

	public void setTemperatur(double temperatur) {
		this.temperatur = temperatur;
	}

	public double getNedbor() {
		return nedbor;
	}

	public void setNedbor(double nedbor) {
		this.nedbor = nedbor;
	}

	public double getVindstyrke() {
		return vindstyrke;
	}

	public void setVindstyrke(double vindstyrke) {
		this.vindstyrke = vindstyrke;
	}

	//ToString metode
	public String toString() {
		return "VaerData [temperatur=" + temperatur + ", nedbor=" + nedbor + ", vindstyrke=" + vindstyrke + "]";
	}
	
	

}
