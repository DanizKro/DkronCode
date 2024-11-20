package DAT100_V2024_Oppg4;

public class Gjøremål {

	private String beskrivelse;
	private int prioritet;
	
	public Gjøremål(String beskrivelse, int prioritet) {
		
		this.beskrivelse = beskrivelse;
		this.prioritet = prioritet;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public int getPrioritet() {
		return prioritet;
	}

	public void setPrioritet(int prioritet) {
		this.prioritet = prioritet;
	}

	@Override
	public String toString() {
		return "Gjøremål [beskrivelse=" + beskrivelse + ", prioritet=" + prioritet + "]";
	}
	
	
}
