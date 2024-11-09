package Uke40;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B1Klasser {

	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		
		int hoyeste = 0;
		
		// System.out.print(hoyeste = Integer.max(b, a));
	
		int[] tab = {0,1,4,5,3,6,5,8,7,2};
		
		
		// Finner høyeste i tabellen og skriver ut
		System.out.print(finn(tab));
	
		
		
		//Finner høyeste fra 2 innput
		String tall1 = showInputDialog("Tall A: ");
		int svar1 = parseInt(tall1);
		String tall2 = showInputDialog("Tall b: ");
		int svar2 = parseInt(tall2);
		
		showMessageDialog(null, Integer.max(svar2, svar1));
		
		
		
		
	}
	
		public static int finn(int[] rad) {
			
			int hoyeste = 0;
			
			for (int i = 0; i < rad.length; i++) {
				
				hoyeste = Integer.max(rad[i], hoyeste);
				
			} return hoyeste;
		}

		
		
		
		
		
}
