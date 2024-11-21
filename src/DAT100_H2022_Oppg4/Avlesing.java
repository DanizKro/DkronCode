package DAT100_H2022_Oppg4;

public class Avlesing {

	private int totalkwh;
	private int forbrukkwh;

	public Avlesing(int totalkwh, int forbrukkwh) {
		super();
		this.totalkwh = totalkwh;
		this.forbrukkwh = forbrukkwh;
	}

	public int getTotalkwh() {
		return totalkwh;
	}

	public void setTotalkwh(int totalkwh) {
		this.totalkwh = totalkwh;
	}

	public int getForbrukkwh() {
		return forbrukkwh;
	}

	public void setForbrukkwh(int forbrukkwh) {
		this.forbrukkwh = forbrukkwh;
	}

	public String toString() {
		return "Avlesing [totalkwh=" + totalkwh + ", forbrukkwh=" + forbrukkwh + "]";
	}
}
