package DAT100_H2022_Oppg3;

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
		
//		boolean svar = false;
//		
//		if(m1.getMid() == m2.getMid()) {
//			svar = true;
//		} return svar;
		
		return (m1.getMid() == m2.getMid());
	} 
	
	// Skal lage en metode som gir svaret som blit puttet inn i metoden sammen med MID-variabelen

	public static Svar mottak(Forespørsel f, double temperatur, double fuktighet, double co2) {
		
		int mid = f.getMid();
		Svar s = null;
		
		switch(f.getMaaling()) {
		
		case Forespørsel.Måling.TEMPERATUR:
				s = new Svar(mid, temperatur);
				break;
		case FUKTIGHET:
				s = new Svar(mid, fuktighet);
				break;
		case CO2:
				s = new Svar(mid, co2);
				break;
		}
		return s;
	}
	
}
