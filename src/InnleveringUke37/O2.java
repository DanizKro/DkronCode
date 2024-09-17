package InnleveringUke37;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {
public static void main(String[] args) {
		
		//Karakter score
		
		for (int i = 1; i <= 10; i++) {
		

		String input = showInputDialog("Nummer: " + i + "\n" + "Tast inn din karakter score:");
	int score = parseInt(input);
		
	if (score > 100 || score <= 0) {
			showMessageDialog(null, "Error, ugyldig poengsum.");
			i-= 1;
	}
	else if (score <= 100 && score >= 90)
			showMessageDialog(null, "Karakteren din er A!");
	
	else if (score <= 89 && score >= 80)
			showMessageDialog(null, "Karakteren din er B!");
	
	else if (score <= 79 && score >= 60)
			showMessageDialog(null, "Karakteren din er C!");
	
	else if (score <= 59 && score >= 50)
			showMessageDialog(null, "Karakteren din er D!");
	
	else if (score <= 49 && score >= 40)
			showMessageDialog(null, "Karakteren din er E!");
	
	else 
		showMessageDialog(null,"Karakteren din er dessverre F...");
	
		}
	}
}
