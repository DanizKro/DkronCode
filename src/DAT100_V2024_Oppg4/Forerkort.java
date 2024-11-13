package DAT100_V2024_Oppg4;

public class Forerkort extends Legitimasjon{
	
	
	private String fodselsnummer;
	private String gyldigTil;


	public Forerkort(String navn, String fodselsnummer,String gyldigtil) {
		super(navn);
		this.fodselsnummer = fodselsnummer;
		gyldigTil = gyldigtil;
	}
	
	public void vis() {
		
		System.out.print("Førerkort: " + "\n" 
		+ "Navn: " + super.getNavn() + "\n"
		+ "Fødselsnummer: " + fodselsnummer + "\n" 
		+ "Validert: " + super.getValidert() + "\n"
		+ "Gyldig til: " + gyldigTil);
	}
	
	//Fake metode som sjekker om noen har gyldig førerkort og returnerer true om de har.
	public boolean erGyldig(String navn, String fodselsnummer) {
		return true;
	}
	
	//Sjekker om personen har gyldig førerkort med metoden erGyldig, om de har det settes variabelen validert i Forerkort
	// klassen til: true)
	public boolean valider() {
		
		if(erGyldig(super.getNavn(), fodselsnummer)) {
			super.setValidert(true);
			return true;
		} else return false;
	}
	
	//Fake metode som krypterer fødselsnummer og returnerer en kryptert tekst stereng for fødselsnummer
	private String kryptert() {
		return "GadGwehYh49ASD19nqiwodn";
	}
	
	
	public void visKryptert() {
		
		System.out.print("Førerkort: " + "\n" 
		+ "Navn: " + super.getNavn() + "\n"
		+ "Fødselsnummer: " + kryptert() + "\n" 
		+ "Validert: " + super.getValidert() + "\n"
		+ "Gyldig til: " + gyldigTil);
	}
	
	
	
	
	
	
	
	
	
	
}
