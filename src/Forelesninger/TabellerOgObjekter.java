package Forelesninger;

public class TabellerOgObjekter {

	public static void main(String[] args) {
		
		Bok b = new Bok("java..", "lars",200.50,200);
		
		b.skrivUt(); //metode for å skrive ut elementer i tabellen bok
		
		Bok[] bTab = new bok[3];
		
		bTab[0] = b;
		bTab[1] = new Bok();
		bTab[2] = new Bok("Matematikk", "kari", 300, 250);
		
	//	for(Bok i : bTab) {							//utvidet for løkke
	//	System.out.print(i.getTittel());			// get.Tittel er metode
	//		i.skrivUT();							// Metode for å skive ut hele innhold til boken i referansetabell
	//	} 
		
		skrivBokTabell(bTab);
		
		visBilligereEnn(bTab, 249.0);
		
		public static void skrivBokTabell(Bok[] tab) {
			
			for (Bok i : tab) {
				e.skrivUt();
			}
		}
		
		public static void visBilligereEnn(Bok[] tab, double grense) {
			
			for (Bok i : tab) {
				if (i.getPris() < grense) {
					e.skrivUT();
				}
			}
		
	}
}
