package Oppg5ProveEksamen;

public class Tidspunkt extends Bestilling{

	private String tidspunkt;
	private String dato;
	
	
	public Tidspunkt(String navn, int kontaktnr, String adr, String tidspunkt, String dato) {
		super(navn, kontaktnr, adr);
		this.tidspunkt = tidspunkt;
		this.dato = dato;
	}
	
	@Override
	public String skrivUt() {
		
		return super.skrivUt() + "\n" + "Tidspunkt: " + tidspunkt + "\n"  + "Dato: " + dato;
	}
	
	
}
