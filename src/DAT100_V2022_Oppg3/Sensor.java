package DAT100_V2022_Oppg3;

public abstract class Sensor {

	private String navn;
	private int id;
	
	public Sensor(String navn, int id){
		this.navn = navn;
		this.id = id;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNavn() {
		return navn;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Sensor [id=" + id + ", " + "navn=" + navn + "]";
	}
	
	
	
}
