package DAT100_V2024_Oppg5;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] bestill = {
				{2,		 0, 	111 },
				{2,	     0, 	0 },
				{222,	 0, 	333 },
				{0,		 0, 	444 },
				{0, 	 0, 	0 }
				};
		
		vis(bestill);
		
		bookTidspunkt(bestill,2,999);
		
		vis(bestill);
		
		System.out.print(erFullBooket(bestill, 0));
	}
	
	
	public static void sett(int[][] bestill, int r, int k, int v) {
	
		if (v < 0) {
			bestill[r][k] = 0;
		} else {
			bestill[r][k] = v;
		}
	}
	
	public static boolean erLedig(int[][] bestill, int tp, int gr) {
		
//		if(bestill[tp][gr] == 0) {
//			return true;
//		} else return false;
		
		return bestill[tp][gr] == 0;		// returner
	}
	
	public static void vis(int[][]bestill) {
		
		System.out.println("-".repeat(bestill[0].length*11+1));
		
		// Alt tabell print
		// for (int[] : bestill)		nøstet løkke
		//	for (int v : bestill)
		
		for (int i = 0; i < bestill.length; i++) {				//utvidet for-løkke
			for (int j = 0; j < bestill[i].length; j++) {
				
				if(bestill[i][j] == 0) {
				System.out.print("|          |");
				} else {
				System.out.print(String.format("|"+"%10d", bestill[i][j]) + "|");
			}
		} System.out.println();
		
		
	} System.out.println("-".repeat(bestill[0].length*11+1));
	
	}
	
	
	public static boolean book(int[][] bestill, int tp, int gr, int kunde) {
		
		boolean booket = false;
		
		if(bestill[tp][gr] == 0) {
			bestill[tp][gr] = kunde;
			booket = true;
		}
		
		return booket;
	}
	
	public static boolean bookTidspunkt(int[][] bestill, int tp, int kunde) {
		
		//boolean booket = false;
		
		for (int i = 0 ; i < bestill[tp].length; i ++) {
			
			if(bestill[tp][i] == 0) {
				bestill[tp][i] = kunde;
				return true;
				// break;							// Avslutte innsettig av kunde, når første ledige er funnet
			}
		}
		return false;
	}
	
	public static boolean erFullBooket(int[][] bestill, int gr) {
		
		boolean ledig = false;
		
		for(int i =0; i < bestill.length; i++) {
			if(bestill[i][gr] == 0) {
				ledig = true;
				break;
			}
		} return ledig;
	}
	
	
	
	
	
	
	
	
	
	
	
}
