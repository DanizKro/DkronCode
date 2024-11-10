package Oppg5ProveEksamen;

public class SnarestMulig extends Bestilling {

	
	private int maxtid;
	
	public SnarestMulig(String navn, int kontaktnr, String adr, int maxtid) {
		super(navn, kontaktnr,adr);
		this.maxtid = maxtid;
		
	}
	
	@Override
	public String skrivUt() {
		
		return super.skrivUt()+ "\n"+ "Maxtid: " + maxtid + "minutter";
	}
	
}
