package DAT100_H2023_Oppg3;

public class Billett {
	

	// 3a)
	private String referanse;
	private String navn;
	private String tidspunkt;
	
	// 3b)
	public Billett(String referanse, String navn, String tidspunkt) {
		
		this.referanse = referanse;
		this.navn = navn;
		this.tidspunkt = tidspunkt;
	}
	
	// 3c)
	//Getters
	public String getReferanse() {
		return referanse;
	}
	public String getNavn() {
		return navn;
	}
	public String getTidspunkt() {
		return tidspunkt;
	}
	//Setters
	public void setReferanse(String referanse) {
		this.referanse = referanse;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public void setTidspunkt(String tidspunkt) {
		this.tidspunkt = tidspunkt;
	}
	
	// 3d)
	
	public String print() {
		return "";
	}
	
	
	
}
