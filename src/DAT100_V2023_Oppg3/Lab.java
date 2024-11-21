package DAT100_V2023_Oppg3;

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
