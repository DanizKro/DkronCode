package DAT100_H2023_Oppg5;

public class ToDimmensjonaleTabeller {

	public static void main(String[] args) {
		
		boolean[][] profil = {
				{false, false, true, false, false },
				{false, true, true, true, false},
				{false, true, true, true, true },
				{true, true, true, true, true,}
				};
		
		//vis(profil);
		vis2(profil);
		boolean[] tab = {true,
						true, 
						true, 
						false};
		
		erstatt(profil, tab);
		
		System.out.println();
		
		//vis(profil);
		vis2(profil);
	
		
	}
	
	public static void sett(boolean[][] profil, int r, int k, boolean v) {
		
		profil[r][k] = v;
		
	}
	
	public static void vis(boolean[][] profil) {
		
		for(int i=0; i< profil.length; i++) {
			for(int j=0; j<profil[i].length; j++) {
			
				if(profil[i][j]) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}
	}
	
	//Fake metode
	public static int random(int max) {

		return max;
	}
	
	//IKKE EKSAMENS OPPG
	
	public static void vis2(boolean[][] tab) {
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				if(tab[i][j]) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}  System.out.println();
		}
	}
	
	
	public static boolean[] nykolone(int maxhoyde) {
		
		boolean[] tab = new boolean[maxhoyde];
		
		for(int i = 0; i< tab.length; i++) {
			
			if(i < random(maxhoyde)) {
				tab[i] = true;
			}
		} return tab;
	}
	
	// Alternativ løsning
	
	public static boolean[] nykolonne2(int maxhoyde) {
		
		int random = random(maxhoyde);
		
		boolean[] tab = new boolean[maxhoyde];
		
		for(int i = 0; i < random; i++) {
			tab[i] = true;
		} return tab;
	}

	public static void erstatt(boolean[][] profil, boolean[] nykolonne) {
		
		int siste = profil[0].length-1;
		
//		for(int i = 0; i < profil.length; i++) {
//			int pos = profil.length-1-i;
//			profil[pos][siste] = nykolonne[i];
//		}
		
		for(int i = 0; i < profil.length; i++) {
			profil[i][profil[0].length-1] = nykolonne[i];
		}
	}
	
	
	
	
}
