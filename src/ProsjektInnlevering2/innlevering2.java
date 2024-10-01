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
		
		// innlevering2.tilStreng(obs);
		
		// innlevering2.skrivUt(innlevering2.settSammen(t1, t2));
		
		innlevering2.skrivUt2(innlevering2.skaler(2, obs));
		//innlevering2.skrivUt2(obs);
		
	}
	
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j];
			}
		}
		return nyMatrise;
			}



	public static void tilStreng(int[][] matrise) {

		
		for (int i = 0; i < matrise.length; i++) { 

			int[] rad = matrise[i];

			for (int z = 0; z < rad.length; z++)
	
				System.out.print(matrise[i][z] + " ");
			System.out.println(" }");
			
			
		}
	}

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
	 
			
	private static void skrivUt2(int[][] tab) { // e) og f)

		for (int i = 0; i < tab.length; i++) {
			
			for (int j = 0; j <tab[i].length; j++)
				
				System.out.print(tab[i][j] + ",");
			System.out.println();
			}
		}
	
	
	private static void skrivUt(int[] tab) { // e) og f)

		for (int i = 0; i < tab.length; i++) {

			System.out.print(tab[i] + ",");
		}
	}
}
