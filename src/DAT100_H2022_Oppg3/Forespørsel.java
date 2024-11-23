package DAT100_H2022_Oppg3;

public class Forespørsel extends Melding{

	private Måling måling;
	
	public enum Måling {
		TEMPERATUR, FUKTIGHET, CO2,
	}
	
	
	public Forespørsel(int mid, Måling måling) {
		super(mid);
		this.måling = måling;
	}
	
	@Override
	public String toString() {
		
		return (super.getMid()) + "Forespørsel " + måling.toString();
	}
	
	static Måling s1 = Måling.TEMPERATUR;
	
	public static void main(String[] args) {
		
		System.out.print(s1);
	}
	
}
