package ProveOppg6;

public class Bestilling {
		
		int kontaktnummer;
		String kundenavn;
		String adresse;
		
		
		public void bestilling(String navn, int kontaktnummer, String adresse) {
			this.kundenavn = navn;
			this.kontaktnummer = kontaktnummer;
			this.adresse = adresse;
		}
		
		public void skrivUt() {
			
			System.out.println(kontaktnummer + ", " +  kundenavn + ", " +  adresse);
		}
		
}
