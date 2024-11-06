package ProveOppg6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ordre = new Scanner(System.in);
		System.out.print("Trykk 1 for SnarestMulig bestilling, eller 2 for Tidspunkt");
		String innput = ordre.nextLine();
		
		int svar = Integer.parseInt(innput);
		
		Bestilling bestilling = null;
		
		
		if(svar == 1) {

			System.out.print("Tast inn ditt navn(tekst): ");
			String navn = ordre.nextLine();
		
			System.out.print("Tast inn ditt tlf nummer(tall): ");
			int nummer = Integer.parseInt(ordre.nextLine());
			
			System.out.print("Tast inn adresse(tekst): ");
			String adresse = ordre.nextLine();
			
			System.out.print("Hvor lenge er max ventetid i minutter(tall): ");
			int lengde = Integer.parseInt(ordre.nextLine());
			
			bestilling = new SnarestMulig(navn,nummer,adresse, lengde); //Setter SnarestMulig = bestilling som definert tidligere:
			
			} 
			else if (svar ==2) {
	
			System.out.print("Tast inn ditt navn(tekst): ");
			String navn = ordre.nextLine();
			
			System.out.print("Tast inn ditt tlf nummer(tall): ");
			int nummer = Integer.parseInt(ordre.nextLine());
			
			System.out.print("Tast inn adresse(tekst): ");
			String adresse = ordre.nextLine();
			
			System.out.print("Tast inn dato(tekst): ");
			String dato = ordre.nextLine();
			
			
			System.out.print("Tast inn tidspunkt(tekst): ");
			String tidspunkt = ordre.nextLine();
			
			bestilling = new Tidspunkt(navn,nummer,adresse, dato, tidspunkt); //Setter Tidspunkt = bestilling som definert tidligere:
			
		}
		
		ordre.close(); // Husk å lukke scanneren
		
		// Sjekker om bestilling er ok
        if (bestilling != null) {
            System.out.print(bestilling.skrivUt());
        } else {
            System.out.println("Ugyldig valg.");
        }
	}

}
