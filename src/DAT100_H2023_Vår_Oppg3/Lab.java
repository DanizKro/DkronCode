package DAT100_H2023_Vår_Oppg3;

public class Lab extends Rom{

	
	private int antall;
	
	
	public Lab(char blokk, int nr, int antall) {
		
		super(blokk,nr);
		this.antall = antall;

	}
	
	@Override
	public String toString() {
		
		return "Lab: "+ super.toString() + "[" + antall +"]";
	}
	
	
	
	
	
	
	
}
