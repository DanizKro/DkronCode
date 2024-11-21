package DAT100_H2022_Oppg3;

public abstract class Melding {

	private int mid;
	
	
	public Melding(int mid) {
		this.mid = mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	public int getMid() {
		return mid;
	}
	
	@Override
	public String toString() {
		//return "" + mid;
		return Integer.toString(mid);
	}
}
