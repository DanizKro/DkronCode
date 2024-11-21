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
	
	
	public static Svar mottak(Forespørsel f, double temperatur, double fuktighet, double co2) {
		
		int mid = f.getMid();
		Svar s = null;
		
		switch(f.getMåling()) {
		
		}
		
	}
	
}
