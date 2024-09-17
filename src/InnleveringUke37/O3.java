package InnleveringUke37;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {
	public static void main(String[] args) {

		int n = parseInt(showInputDialog(null, "Tast et tall"));

		if (n <= 0) {
			showMessageDialog(null, "tallet må være større enn 0.");
		} else {

			long resultat = fakultet(n);

			showMessageDialog(null, "Fakultet av tallet" + resultat);

			System.out.println(12 % 2);
		}
	}
	// metode for å regne ut fakultet av "n":

		private static long fakultet(int n) {
			
			long resultat = 1;
			
			for (int i = 1; i <= n; i++) {
				resultat*= i;
			} 
			return resultat;
			
}
}
