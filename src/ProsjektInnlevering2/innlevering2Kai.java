package ProsjektInnlevering2;

import java.util.Arrays;

public class innlevering2Kai {
	
	public static void main(String[] args) {
		
		int[][] obs = { 
			{ 1, 1, 1, 2 },
			{ 5, 7, 9, 7, 3 },
			{ -1, -1, -2 } 
		};

		int[][] obsX = { 
			{ 1, 1, 1, 2 },
			{ 5, 7, 9, 7, 3 },
			{ -1, -1, -2 } 
		};

		int[][] obsY = { 
			{ 1, 2, 1, 2 },
			{ 5, 7, 9, 7, 3 },
			{ -1, -1, -2 } 
		};
		
		int[] obs1 = new int[3];
		obs1[0] = 1;
		obs1[1] = 4;
		obs1[2] = 6;
		
		int[] obs2 = new int[1];
		obs2[0] = 1;
		
		int[] t1 = new int[2];
		t1[0] = 1;
		t1[1] = 3;

		int[] t2 = new int[3];
		t2[0] = 5;
		t2[1] = 4;
		t2[2] = 7;

		// Tabell som inneholder navn, pris, og antall varer.
		// Kommentar: Her blandes tall og strenger, og dermed må tabellen være av typen streng.
		String[][] varer = {
            {"nVidia 5090", "35000", "3"},
            {"Intel CPU", "9000", "1"},
            {"Pimax Crystal", "12000", "2"}
        };

		// Skriv ut varer
		skrivUtVarerSomStreng(varer);
		
		// Slå sammen Obs og t1 i stigende rekkefølge i ny matrise
		int[][] nyMatrise = settSammen(obs, t1);
		skrivUtMatrise(nyMatrise);

		// Slå sammen obs1 og t2 i stigende rekkefølge i ny matrise
		int[] nyTabell = settSammen(obs1, t2);
		skrivUtTabell(nyTabell);
		
		// Er obs og obsX lik (ja)?
		System.out.println("obs og obsX er lik: " + erLik(obs, obsX));

		// Er obs og obsY lik (nei)?
		System.out.println("obs og obsY er lik: " + erLik(obs, obsY) + "\n");

		// Skaler nyMatrise med 2		
		skaler(2, nyMatrise);
		skrivUtMatrise(nyMatrise);

		//Sett sammen t1 og t2
		int[] sammensattTabell = settSammen(t1, t2);
		skrivUtTabell(sammensattTabell);

		// Sett sammen obs og t2
		int[][] sammensattMatrise = settSammen(obs, t2);
		skrivUtMatrise(sammensattMatrise);
	}
	
	// Sjekker om en matrise er link en annen matrise
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		// Sjekker først om dimensjonene er like
		if (mat1.length != mat2.length) {
			return false;
		}
	
		// Sjekker alle kolonner og rader
		for (int i = 0; i < mat1.length; i++) {
			
			// Sjekker lengden på kolonnen (i) 
			if (mat1[i].length != mat2[i].length) {
				return false; // Ulike antall kolonner i rad i
			}
	
			// Sjekker at verdiene i posisjon (i, j) er lik 
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false; // Ulike verdier på posisjon (i, j)
				}
			}
		}
	
		// Hvis ikke noen 'return false' slår inn, blir det 'return true'
		return true;
	}
	
	
	// Multipliserer alle elementene i en matrise med et gitt tall
	public static int[][] skaler(int tall, int[][] matrise) {
		for(int i=0 ; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				matrise[i][j] *= tall;
			}
		}
	 	return matrise;
	}

	// Setter sammen to 1-dimensjonal tabeller i stigende rekkefølge
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];
		int nyTabellIndeks = 0;
		
		
		// Kopierer inn fra tabell1
		for(int i=0; i<tabell1.length; i++){
			nyTabell[nyTabellIndeks] = tabell1[i];
			nyTabellIndeks++;
		}

		// Kopierer inn verdiene fra tabell2
		for(int i=0; i<tabell2.length; i++){
			nyTabell[nyTabellIndeks] = tabell2[i];
			nyTabellIndeks++;
		}

		// Bruker java sin innebygde sortering
		Arrays.sort(nyTabell);

		return nyTabell;
	}	

	// Setter sammen en matrise og en 1-dimensjonal tabell
	public static int[][] settSammen(int[][] tabell1, int[] tabell2){
		
		// Ny tabell med plass til tabell2
		int[][] nyTabell = new int[tabell1.length + 1][];
		// Må Initialisere den nye siste raden. 
		nyTabell[nyTabell.length - 1] = new int[tabell2.length]; 

		// Kopierer verdier fra tabell1 til nyTabell
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = new int[tabell1[i].length];
			
			for (int j = 0; j < tabell1[i].length; j++) {
				nyTabell[i][j] = tabell1[i][j];
			}
			
			// Bruker java sin innebyggete sortering
			Arrays.sort(nyTabell[i]);
		}
	
		// Kopierer verdier fra tabell2 til nyTabell
		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[nyTabell.length-1][i] = tabell2[i];
		}

		// Bruker java sin innebyggete sortering
		Arrays.sort(nyTabell[nyTabell.length-1]);

		return nyTabell;
	}

	// Skriv ut varer
    public static void skrivUtVarerSomStreng(String[][] varer) {
        System.out.println("\n------------------------------");
        System.out.println("Navn\t\tPris\tAntall");
		System.out.println("------------------------------");
        
		for (int i = 0; i < varer.length; i++) { 
            System.out.println(varer[i][0] + "\t" + varer[i][1] + "\t" + varer[i][2]);
        }
		
		System.out.println("------------------------------\n");
    }

	// Skriv ut endimensjonal tabell
	private static void skrivUtTabell(int[] tab) {
		System.out.println("Skriv ut endimensjonal tabell:");

		for (int i = 0; i < tab.length; i++) {
			System.out.print(i < tab.length-1 ? tab[i] + ", " : tab[i]);
		}

		System.out.print("\n\n");
	}
		 
	// Skriv ut matrise (flerdimensjonal tabell)
	public static void skrivUtMatrise(int[][] tab) {
		System.out.println("Skriv ut matrise (flerdimensjonal tabell):");
		
		for (int i = 0; i< tab.length; i++) {
			for (int j = 0; j< tab[i].length; j++){ 
				System.out.print(j < tab[i].length-1 ? tab[i][j] + ", " : tab[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}
}