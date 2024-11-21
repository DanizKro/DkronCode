package DAT100_V2023_Oppg3;

public abstract class Rom {

	
	private int nr;
	private char blokk;
	
	public Rom(char blokk, int nr) {
		this.nr = nr;
		this.blokk = blokk;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public char getBlokk() {
		return blokk;
	}

	public void setBlokk(char blokk) {
		this.blokk = blokk;
	}
	
	@Override
	public String toString() {
		
		return Character.toString(blokk) +nr;
		// return "" + blokk +nr;				//Like bra?
	}
	
	
	
}
