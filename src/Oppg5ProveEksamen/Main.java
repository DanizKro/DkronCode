package Oppg5ProveEksamen;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Main {

	
	public static void main (String [] args) {
		
		
//		Scanner ordre = new Scanner(System.in);
//		System.out.println("Trykk 1 for SnarestMulig og 2 for Tidspunkt bestilling: ");
//		String svar = ordre.nextLine();
		
		String ordre = showInputDialog("1 for SnarestMulig bestilling" + "\n" + "2 for Tidspunkt bestilling:");
		
		int svar = Integer.parseInt(ordre);
		
//		while (svar > 2 || svar < 1) {
//			showMessageDialog(null,"Ugylig bestilling, prøv igjen.");
//			showInputDialog("1 for SnarestMulig bestilling" + "\n" + "2 for Tidspunkt bestilling:");
//		}
		
		
		if(svar == 1 || svar == 2 ) {
		
		String skrivUt = "" ;
		
		//SnarestMulig
		if (svar == 1) {
			
			String navn = showInputDialog("Ditt navn: ");
			
			String spm = showInputDialog("Tlf nr: ");
			int kontaktnr = Integer.parseInt(spm);
			
			String adr = showInputDialog("Adresse: ");
			
			String spm2 = showInputDialog("Makstid i minutter du kan vente: ");
			int maxtid = Integer.parseInt(spm2);
			
			
			Bestilling nyBestilling1 = new SnarestMulig(navn,kontaktnr,adr,maxtid);
			
			skrivUt = nyBestilling1.skrivUt();
			
			
		} else if (svar == 2 ) {
			String navn = showInputDialog("Ditt navn: ");
		
			String spm = showInputDialog("Tlf nr: ");
			int kontaktnr = Integer.parseInt(spm);
			
			String adr = showInputDialog("Adresse: ");
			
			String tidspunk = showInputDialog("Tidspunkt: ");
			
			String dato = showInputDialog("Dato: ");
			
			
			Tidspunkt nyBestilling2 = new Tidspunkt(navn,kontaktnr,adr,tidspunk,dato);
			
			skrivUt = nyBestilling2.skrivUt();
		}
		
		showMessageDialog(null, skrivUt);
		
		}
			
		}
		
	} 
	
