package Oppg4ProveEksamen;

public class ToDoListe {
	

	//Klassevariabel av typen ToDoElement av typen tabell
	private ToDoElement[] todoTab;
	
	
	int antall;
	
	public ToDoListe(int maksAntall) {
		
		todoTab = new ToDoElement[maksAntall];
		antall = 0;
	}
	
	public void leggTil(ToDoElement tde){
		
		if(antall < todoTab.length) {			
			todoTab[antall] = tde;
			antall++;
		} else
			System.out.println("Det er ikke plass i tabellen til Elementet: " + "\n" +tde);
			
	}
	
	//Definerer et veldig høyt tall (Integer.MAX_VALUE) sjekker om prioritet er lavere enn der(som det mest sannsynlig vil være)
	// og setter det nye tallet til variabel "tall". Sjekker om neste prioritet er lavere og eventuelt erstatter med det.
	public ToDoElement finnViktig() {
		
		int pos = 0;
		int tall = Integer.MAX_VALUE;
		
		for (int i = 0; i < antall; i++) {				//Må være mindre enn antall fordi kan ikke bruke .getPrioritet 
			if (todoTab[i].getPrioritet() < tall) {		// på "null" peker. Tabellen er nødvendigvis ikke full!
				tall = todoTab[i].getPrioritet();
				pos = i;
			}
		} return todoTab[pos];						//Returnerer peker til tabellen som inneholder lavest tall(høyeste prioritet)
	}
	
	
	
	
}
