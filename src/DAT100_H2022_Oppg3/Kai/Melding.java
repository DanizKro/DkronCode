package DAT100_H2022_Oppg3.Kai;

public abstract class Melding {

	private int mid;
	
	public Melding(int mid) {
		this.mid = mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	public int getMid() {
		return this.mid;
	}
	
	@Override
	public String toString() {
		return Integer.toString(mid);
	}
}