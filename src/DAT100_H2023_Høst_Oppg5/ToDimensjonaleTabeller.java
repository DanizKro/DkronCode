package DAT100_H2023_Høst_Oppg5;

public class ToDimensjonaleTabeller {
	

	public static void main(String[] args) {
		
		int[][] terreng = {
				{ 5, 5, 6, 7, 8, 9, 9, 9, 9, 10 },
				{ 5, 5, 4, 3, 3, 3, 4, 5, 8, 8 },
				{ 5, 5, 4, 2, 2, 2, 2, 3, 7, 9 }
				};
		
		// visualiser(terreng);
		// visualiser(blirOversvommet(terreng,7));
	
		System.out.print(finnHoyestePunkt(terreng));
		System.out.println();
		System.out.print(antallOversvommet(terreng, 7));
	}

	public static int hentHoyde(int[][] terreng, int r, int p) {
		
		return terreng[r][p];
	}
	
	public static void visualiser(int[][] terreng) {
		
		for(int i = 0; i < terreng.length; i++) {
			for (int j = 0; j < terreng[i].length; j++) {
				System.out.print(terreng[i][j] + " ");
			} System.out.println();
		}
	}
	
	
	public static int finnHoyeste(int[] rad) {
		
		int hoyeste = Integer.MIN_VALUE;
		
		for (int i = 0; i < rad.length; i++) {
			
			if(rad[i] > hoyeste) {
				hoyeste = rad[i];
			}
		} return hoyeste;
	}
	
	// Alternativ metode
	
	public static int finnHoyeste2(int[] rad) {
		
		int hoyeste = 0; 
		
		for(int h:rad) {
			hoyeste = Integer.max(h, hoyeste);
		} return hoyeste;
	}
	
	public static int finnHoyestePunkt(int[][] terreng) {
		
		int hoyeste = 0; 
		
		for(int i = 0; i < terreng.length; i++) {
			for (int j = 0; j < terreng[i].length; j++) {
				hoyeste = Integer.max(terreng[i][j], hoyeste);
			}
		} return hoyeste;
	
	}
	
	public static int antallOversvommet(int[][] terreng, int hoyde) {
		
		int antall = 0;
		
		for(int i = 0; i < terreng.length; i++) {
			for (int j = 0; j < terreng[i].length; j++) {
				
				if(hoyde > terreng[i][j]) {
					antall++;
				}
			}
		} return antall;
	}
	
	public static boolean[][] blirOversvommet(int[][] terreng, int hoyde) {
	
		boolean[][] tab = new boolean[terreng.length][];
		
		//Lager en ny rad som er like lang som terreng[i] rad (den kan være forskjellig lengde på)
		for(int i = 0; i < terreng.length; i++) {		
			tab[i] = new boolean[terreng[i].length];
			} 
		
		for(int i = 0; i < terreng.length; i++) {
			for (int j = 0; j < terreng[i].length; j++) {
				
				if(terreng[i][j] < hoyde) {
					tab[i][j] = true;
				}
			}
		} return tab;
	} 
	
	
	
	
	
	
	
}
