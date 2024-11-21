package DAT100_V2023_Oppg3;

public class Main {
	
	public static void main(String[] args) {

	
	Rom[] navn = new Rom[1]; 							// Lager først en tabell med plass til en objekt peker.
	
	Etasje nr1 = new Etasje(1, navn);					// Lager en etasje med plass tik tabellen av objekt pekere.
	
	Kontor kontornr1 = new Kontor('C', 10, "Daniel");	// Lager en ny objekt-variabel av datatypen Kontor.
	
	nr1.leggTil(kontornr1);								// Legger til datatypen kontor til etasjen.

	
	
	System.out.print(nr1.toString());
	
	
	
	
	}
}
