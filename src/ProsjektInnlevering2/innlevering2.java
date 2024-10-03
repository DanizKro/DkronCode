package ProsjektInnlevering2;

import java.util.Arrays;

public class innlevering2 {
	
	public static void main(String[] args) {
		
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
		
		
		int[][] obs = { { 1, 1, 1, 2 }, 
				{ 5, 7, 9, 7, 3 },
				{ -1, -1, -2 } };
		
		// Lag en tabell med innhold av navn, pris, og antall varer
		//  + lage en metode som skriver ut som streng
		
		// Slå sammen Obs og T1 i stigende rekkefølge i ny matrise
		
		
		
		
		// innlevering2.tilStreng(obs);
		
		// innlevering2.skrivUt(innlevering2.settSammen(t1, t2));
		
		innlevering2.skrivUt2(innlevering2.skaler(2, obs));
		
	}
	
	// sjekker om matrisen er link en annen matrise
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		boolean svar = false;
		
		if(mat1.length == mat2.length) {
			
		for(int i=0 ; i<mat1.length; i++) {
			
			if(mat1[i].length == mat2[i].length) {
			
			for (int j=0; j<mat1[i].length; j++) {
			
				if(mat1[i][j] == mat2[i][j]) {
					svar = true;
				}
				
			}
		}
	}
	}
			return svar;
}
	
	
	
	// Multipliserer en alle elementene i en matrise med et gitt tall
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][];
		
		for(int i=0 ; i<matrise.length; i++) {
			
			nyMatrise[i] = new int[matrise[i].length];
			
			for (int j=0; j<matrise[i].length; j++) {
			
				nyMatrise[i][j] = matrise[i][j]*2;
				
			}
	
	} return nyMatrise;
	}

// skrive ut en matrise til streng?
	public static void tilStreng(int[][] matrise) {

		
		for (int i = 0; i < matrise.length; i++) { 

			int[] rad = matrise[i];

			for (int z = 0; z < rad.length; z++)
	
				System.out.print(matrise[i][z] + " ");
			System.out.println(" }");
			
			
		}
	}
// setter sammen to 1-dimensjonal tabeller i stigende rekkefølge
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
	
			
			int tab1 = tabell1.length;
			int tab2 = tabell2.length;
			int tab3 = tab1 + tab2;
			
			int[] nyTabell = new int[tab3];
			
		
			for (int i = 0; i < tab1; i++ ) 
			
					nyTabell[i] = tabell1[i];
				
				
				for (int e = tab1; e < tab3; e++) {
					nyTabell[e] = tabell2[e-tab1];
					
				} Arrays.sort(nyTabell);
				
				
				return nyTabell; 
			}
	 
	//Skriver ut matriser/fler dimensjonale tabeller
	public static void skrivUt2(int[][] tab) {
		
		for (int i = 0; i< tab.length; i++) {
			
			for (int j = 0; j< tab[i].length; j++) 
				
				System.out.print(tab[i][j] + ",");
			System.out.println();
		}
	}

	
	//skriver ut endimensjonal tabell
	private static void skrivUt(int[] tab) { // e) og f)

		for (int i = 0; i < tab.length; i++) {

			System.out.print(tab[i] + ",");
		}
	}
}
