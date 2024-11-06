package ProveOppg6;

public class Tidspunkt extends Bestilling {

	
		String dato;
		String tidspunkt;
		
		public Tidspunkt (String navn, int kontaktnummer, String adresse, String dato, String tidspunkt) {
			super(navn,kontaktnummer,adresse);
			this.dato = dato;
			this.tidspunkt = tidspunkt;
		}
		
		@Override
		public void skrivUt() {
			
			System.out.println(kontaktnummer + ", " +  kundenavn + ", " +  adresse + ", " + dato + ", " + tidspunkt);
		}
	
}
