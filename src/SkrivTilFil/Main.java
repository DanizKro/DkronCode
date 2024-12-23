package SkrivTilFil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main {
	
	// 3i)
		public static void main(String[] args)  {
			
			FlexBillett billett = FlexBillett.hentInfo();
			
			// System.out.print(billett.print());
			
			String nyttTidspunkt = FlexBillett.showInputDialog("Nytt tidspunkt: ");
			
			billett.endreTidspunkt(nyttTidspunkt);
			
			// System.out.print(billett.print());
			
			//Skriv utfil
			
			FlexBillett n1 = new FlexBillett("Referanse: 1234", "Daniel Kronheim", "13.11.2024");
			FlexBillett n2 = new FlexBillett("Referanse: 4567", "Christopher Strandheim", "13.11.2024");
			FlexBillett n3 = new FlexBillett("Referanse: 7890", "Martin Hatlestad", "13.11.2024");
			// System.out.print(n1.print());
			
			  printFil(n1, "Billett - Nr1.txt");		//Skriver ut et dokument per utskrift
			  printFil(n2, "Billett - Nr2.txt");		//må endre navn for å ikke skrive over gammel fil
		}

		
		public static void printFil(FlexBillett billett, String filnavn) {
			
			try {
				File dir = new File("/Users/dkron/Documents");
				File nyFil = new File(dir,filnavn);
				
				PrintWriter skriv = new PrintWriter(nyFil);
				
				skriv.print(billett.print());
				
				skriv.close();
				System.out.println("skrevet ut");
		
			} catch (Exception e) {
				System.out.print("Feil" + e.getMessage());
			}
		}
		
		
		
		
		
		
		
}
