package ProveOppg5;

public class Bestilling {
		
		int kontaktnummer;
		String kundenavn;
		String adresse;
		
		
		public Bestilling(String navn, int kontaktnummer, String adresse) {
			this.kundenavn = navn;
			this.kontaktnummer = kontaktnummer;
			this.adresse = adresse;
		}
		
		public String skrivUt() {
	        return "Kundenavn: " + kundenavn + ", Kontaktnummer: " + kontaktnummer + ", Adresse: " + adresse;
	    }
		
}
