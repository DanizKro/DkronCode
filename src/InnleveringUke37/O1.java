package InnleveringUke37;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {
	
	public static void main(String[] args) {
		
		double inntekt = parseInt(showInputDialog("Personinntekt?")); // forkortet versjon av input dialog
		
		double trinn1 = (1.7/100);
		double trinn2 = (4.0/100);
		double trinn3 = (13.6/100);
		double trinn4 = (16.6/100);
		double trinn5 = (17.6/100);
		
		double grense1 = 208051;
		double grense2 = 292851;
		double grense3 = 670001;
		double grense4 = 937901;
		double grense5 = 1350001;
		
		double sum = 0;
		
		
		if (inntekt < grense1-1 ) {
			showMessageDialog(null, "Du trenger ikke betale trinnskatt");	// trinn 0
		}
		
		else if (inntekt >= grense1 && inntekt < grense2) {					// trinn 1
			sum = (inntekt-grense1)*trinn1;
		}
		else if (inntekt >= grense2 && inntekt < grense3) {					// trinn 2
			sum = (inntekt-grense2)*trinn2;
			sum+= (grense2-grense1-1)*trinn1;
			
		}
		else if (inntekt >= grense3 && inntekt < grense4) {					// trinn 3
			sum = (inntekt-grense3)*trinn3;
			sum+= (grense3-grense2-1)*trinn2;
			sum+= (grense2-grense1-1)*trinn1;
		}
		else if (inntekt >= grense4 && inntekt < grense5) {					// trinn 4
			sum = (inntekt-grense4)*trinn4;
			sum+= (grense4-grense3-1)*trinn3;
			sum+= (grense3-grense2-1)*trinn2;
			sum+= (grense2-grense1-1)*trinn1;
		}
		else if (inntekt >= grense5) {										// trinn 5
			sum = (inntekt-grense5)*trinn5;
			sum+= (grense5-grense4-1)*trinn4;
			sum+= (grense4-grense3-1)*trinn3;
			sum+= (grense3-grense2-1)*trinn2;
			sum+= (grense2-grense1-1)*trinn1;
		}
		
		
		showMessageDialog(null, "Du skal betale " + String.format("%.2f", sum) + " i trinnskatt.");
  }
}
