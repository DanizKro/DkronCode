package Oppg4ProveEksamen;

public class ToDoElement {

	String beskrivelse;
	int nummer;
	int prioritet;
	
	public ToDoElement(String beskrivelse, int nummer, int prioritet) {
		
		this.beskrivelse = beskrivelse;
		this.nummer = nummer;
		this.prioritet = prioritet;
		
	}
	
	//setters
	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public void setPrioritet(int prioritet) {
		this.prioritet = prioritet;
	}
	
	//getters
	public String getBeskrivelse() {
		return this.beskrivelse;
	}
	public int getNummer() {
		return this.nummer;
	}
	public int getPrioritet() {
		return this.prioritet;
	}
	
	@Override
	public String toString() {
		
		return beskrivelse + "\n" + 
				"Nummer   :" + nummer + "\n" + 
				"Prioritet: " + prioritet ;
	}
	
	
	
	
	
}
