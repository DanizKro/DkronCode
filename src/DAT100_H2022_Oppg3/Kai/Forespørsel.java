package DAT100_H2022_Oppg3.Kai;

public class Forespørsel extends Melding{

	private Måling måling;

	public enum Måling {
		TEMPERATUR, FUKTIGHET, CO2,
	}
	
	public Forespørsel(int mid, Måling temperatur) {
		super(mid);
		this.måling = temperatur;
	}

	public Måling getMåling() {
        return måling;
    }

	@Override
	public String toString() {
		
		return super.getMid() + " Forespørsel " + måling.toString();
	}
}
