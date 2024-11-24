package DAT100_V2022_Oppg3;

public class Stasjon {
	
	// 3g)

	// ingen dataype på navn i oppgaven, antar derfor String
	//Feil navnbruk i oppgaven, dette heter KLASSEVARIABLER ikke objektvaribaler[]....
	
	private String navn;
	private TemperaturSensor temperatursensor;
	private Co2Sensor co2sensor;
	private Fuktsensor fuktsensor;
	
	
	
	public Stasjon(String navn) {
		
		//veldig dårlig oppgave, dårlig beskrivelse. Står ikke noe at vi skal gi fiktive verdier til variablene
		this.navn = navn;
		temperatursensor = new TemperaturSensor("String", 1, 22.5);
		co2sensor = new Co2Sensor("CO2 senso", 2, 100);
		fuktsensor = new Fuktsensor("Fuktsensor", 3, 50);
		
	}
	
	public void Sensors() {
		
		System.out.println(temperatursensor.toString());
		System.out.println(co2sensor.toString());
		System.out.println(fuktsensor.toString());
		
	}
	
	public void display() {
		
		System.out.println(navn);
		System.out.println("Temperatur: " + temperatursensor.getTemperatur());
		System.out.println("CO2:      : ") + co2sensor.getCo2());
		System.out.println("Fuktighet : ") + fuktighet.getFuktighet());
	}
	
	
	
	
	
	
	
	
	
	
}
