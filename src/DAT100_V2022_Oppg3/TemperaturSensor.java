package DAT100_V2022_Oppg3;

public class TemperaturSensor extends Sensor{

	
	private double temperatur;
	
	
	public TemperaturSensor(String navn, int id, double temperatur) {
		super(navn, id);
		this.temperatur = temperatur;
	}
	
	// ikke bedt om i oppgaven, men lurt å alltid lage getters/setters på klassevariabler
	public void setTemperatur(double temperatur) {
		this.temperatur = temperatur;
	}
	public double getTemperatur() {
		return temperatur;
	}
	
	@Override
	public String toString() {
		
		return "TemperaturSensor [temperatur=" + temperatur + ", " + super.toString() + "]";
	}
	
	
	
	
}
