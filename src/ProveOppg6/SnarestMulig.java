package ProveOppg6;

public class SnarestMulig extends Bestilling{
		
		
		int maxtid;
		
		
		public SnarestMulig(String navn, int kontaktnummer, String adresse, int maxtid) {
			super(navn,kontaktnummer,adresse);
			this.maxtid = maxtid;
		}
		
		@Override
		public void skrivUt() {
			
			System.out.println(kontaktnummer + ", " +  kundenavn + ", " +  adresse + ", " + maxtid);
		}
}