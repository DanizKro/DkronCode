package Oppg5ProveEksamen;

public class Bestilling {

	private int kontaktnr;
	private String navn;
	private String adr;
	
	
	public Bestilling(String navn, int kontaktnr, String adr) {
		
		this.navn = navn;
		this.kontaktnr = kontaktnr;
		this.adr = adr;
	}
	
	public String skrivUt() {
		
		return "Navn: " + navn + "\n" + "Kontakt nummer: " +  kontaktnr +  "\n" + "Adresse: " + adr;
		
	}
	
	
	
	
	
}
