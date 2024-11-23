package DAT100_H2022_Oppg3.Kai;

public class Svar extends Melding{
	
	private double verdi;

	public Svar(int mid, double verdi) {
		super(mid);
		this.verdi = verdi;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Svar " + Double.toString(verdi);
	}
	
	public static boolean match(Melding m1, Melding m2) {
		return m1.getMid() == m2.getMid();
	} 
	
	public static Svar mottak(Forespørsel f, double temperatur, double fuktighet, double co2) {
		
		double verdi = switch (f.getMåling()) {
			case TEMPERATUR -> temperatur;
			case FUKTIGHET -> fuktighet;
			case CO2 -> co2;
		};
		return new Svar(f.getMid(), verdi);
	}
}