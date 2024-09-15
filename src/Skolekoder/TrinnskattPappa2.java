package Skolekoder;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TrinnskattPappa2 {

		// Skattetrinn 1-4 maks betaling
		final static double t1MaksSum = 1441;
		final static double t2MaksSum = 15085;
		final static double t3MaksSum = 36434;
		final static double t4MaksSum = 68408;

		// Skattetrinn 1-5 min/max grense og prosent
		final static double t1MinGrense = 208051;
		final static double t1MaksGrense = 292850;
		final static double t1Prosent = 1.7;
		final static double t2MinGrense = 292851;
		final static double t2MaksGrense = 670000;
		final static double t2Prosent = 4.0;
		final static double t3MinGrense = 670001;
		final static double t3MaksGrense = 937900;
		final static double t3Prosent = 13.6;
		final static double t4MinGrense = 937901;
		final static double t4MaksGrense = 1350000;
		final static double t4Prosent = 16.6;
		final static double t5MinGrense = 1350001;
		final static double t5Prosent = 17.6;

		public static void main(String[] args) {

			double inntekt = parseInt(showInputDialog("Personinntekt?"));
			double trinnSkatt = kalkulerTrinnSkatt(inntekt);
			showMessageDialog(null, "Du skal betale " + String.format("%.2f", trinnSkatt ) + " i trinnskatt.");
		}

		private static double kalkulerTrinnSkatt(double inntekt) {
			if (inntekt > t1MinGrense && inntekt < t1MaksGrense) 
				return (inntekt - t1MinGrense) * (t1Prosent/100);
			if (inntekt >= t2MinGrense && inntekt < t2MaksGrense) 
				return (inntekt - t2MinGrense) * (t2Prosent/100) + t1MaksSum;
			if (inntekt >= t3MinGrense && inntekt < t3MaksGrense) 
				return (inntekt - t3MinGrense) * (t3Prosent/100) + t2MaksSum + t1MaksSum;
			if (inntekt >= t4MinGrense && inntekt < t4MaksGrense) 
				return (inntekt - t4MinGrense) * (t4Prosent/100) + t3MaksSum + t2MaksSum + t1MaksSum;
			if (inntekt >= t5MinGrense) 
				return (inntekt - t5MinGrense) * (t5Prosent/100) + t4MaksSum + t3MaksSum + t2MaksSum + t1MaksSum;
			return -1;
		}
	}