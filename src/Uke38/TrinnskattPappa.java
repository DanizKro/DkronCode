package Uke38;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TrinnskattPappa {

	// #region Klasse konstanter

	// Skattetrinn max betaling
	final static double skattTrinn1MaxSum = 1441;
	final static double skattTrinn2MaxSum = 15085;
	final static double skattTrinn3MaxSum = 36434;
	final static double skattTrinn4MaxSum = 68408;

	// Skattetrinn min/max grense og prosent
	final static double skattTrinn1MinGrense = 208051;
	final static double skattTrinn1MaxGrense = 292850;
	final static double skattTrinn1Prosent = 1.7 / 100;

	final static double skattTrinn2MinGrense = 292851;
	final static double skattTrinn2MaxGrense = 670000;
	final static double skattTrinn2Prosent = 4.0 / 100;

	final static double skattTrinn3MinGrense = 670001;
	final static double skattTrinn3MaxGrense = 937900;
	final static double skattTrinn3Prosent = 13.6 / 100;

	final static double skattTrinn4MinGrense = 937901;
	final static double skattTrinn4MaxGrense = 1350000;
	final static double skattTrinn4Prosent = 16.6 / 100;

	final static double skattTrinn5MinGrense = 1350001;
	final static double skattTrinn5MaxGrense = Double.MAX_VALUE;
	final static double skattTrinn5Prosent = 17.6 / 100;

	// #endregion Klasse konstanter

	// Konstruktør
	public static void main(String[] args) {

		double inntekt = parseInt(showInputDialog("Personinntekt?"));
		double sum = 0;

		if (trinn1(inntekt)) {
			sum += trinn1Betale(inntekt);
		} else if (trinn2(inntekt)) {
			sum += trinn2Betale(inntekt);
		} else if (trinn3(inntekt)) {
			sum += trinn3Betale(inntekt);
		} else if (trinn4(inntekt)) {
			sum += trinn4Betale(inntekt);
		} else if (trinn5(inntekt)) {
			sum += trinn5Betale(inntekt);
		}

		showMessageDialog(null, "Du skal betale " + String.format("%.2f", sum) + " i trinnskatt.");
	}

	// #region Hjelpemetoder - Hva betale i de forskjellige skatterinnene
	private static double trinn1Betale(double inntekt) {
		return inntekt - skattTrinn1MinGrense * (skattTrinn1Prosent);
	}

	private static double trinn2Betale(double inntekt) {
		return (inntekt - skattTrinn2MinGrense) * (skattTrinn2Prosent) + skattTrinn1MaxSum;
	}

	private static double trinn3Betale(double inntekt) {
		return (inntekt - skattTrinn3MinGrense) * (skattTrinn3Prosent) + skattTrinn2MaxSum + skattTrinn1MaxSum;
	}

	private static double trinn4Betale(double inntekt) {
		return (inntekt - skattTrinn4MinGrense) * (skattTrinn4Prosent) + skattTrinn3MaxSum + skattTrinn2MaxSum
				+ skattTrinn1MaxSum;
	}

	private static double trinn5Betale(double inntekt) {
		return (inntekt - skattTrinn5MinGrense) * (skattTrinn5Prosent) + skattTrinn4MaxSum + skattTrinn3MaxSum
				+ skattTrinn2MaxSum + skattTrinn1MaxSum;
	}

	// #endregion Hjelpemetoder - Hva betale i de forskjellige skatterinnene

	// #region Hjelpemetoder - Hvilket skattetrinn?

	private static boolean trinn1(double inntekt) {
		return inntekt > skattTrinn1MinGrense && inntekt < skattTrinn1MaxGrense;
	}

	private static boolean trinn2(double inntekt) {
		return inntekt >= skattTrinn2MinGrense && inntekt < skattTrinn2MaxGrense;
	}

	private static boolean trinn3(double inntekt) {
		return inntekt >= skattTrinn3MinGrense && inntekt < skattTrinn3MaxGrense;
	}

	private static boolean trinn4(double inntekt) {
		return inntekt >= skattTrinn4MinGrense && inntekt < skattTrinn4MaxGrense;
	}

	private static boolean trinn5(double inntekt) {
		return inntekt >= skattTrinn5MinGrense;
	}

	// #endregion Hjelpemetoder - Hvilket skattetrinn?
}