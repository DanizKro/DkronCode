package DAT100_V2022_Oppg5;

public class LEDSkjerm {

	// Ikke eksamens oppgave men bare test av utskrift
	public static void main(String[] args) {

		LEDSkjerm tab = new LEDSkjerm(10, 10);

		tab.set(0, 4, true);
		tab.set(3, 4, true);
		tab.set(2, 3, true);

		// tab.display();
		// tab.startup();

		tab.display();
		tab.hline(1);

		tab.display();

	}

	private boolean[][] skjerm;

	public LEDSkjerm(int h, int b) {

		skjerm = new boolean[h][b];
	}

	public void set(int r, int k, boolean v) {

		skjerm[k][r] = v; // i min hodetabell, er K- vertikal og R - horisontal

	}

	public void reset() {

		for (int i = 0; i < skjerm.length; i++) {
			for (int j = 0; j < skjerm[i].length; j++) {
				skjerm[i][j] = false;
			}
		}

	}

	public void display() {

		int lengde = 0;
		while (lengde < skjerm.length + 2) {
			System.out.print("-");
			lengde++;
		}
		System.out.println();

		for (int i = 0; i < skjerm.length; i++) {
			System.out.print("|");
			for (int j = 0; j < skjerm[i].length; j++) {
				if (skjerm[i][j] == true) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("|");
		}

		System.out.println("-".repeat(skjerm[0].length + 2)); // Erstatter while løkken

	}

	public void startup() {

		reset();
		set(0, 0, true);
		set(0, skjerm.length - 1, true);
		set(skjerm.length - 1, 0, true);
		set(skjerm.length - 1, skjerm.length - 1, true);
		display();
	}

	public void hline(int r) {

		for (int i = 0; i < skjerm[r].length; i++) {
			skjerm[r][i] = true;
		}
	}

}
