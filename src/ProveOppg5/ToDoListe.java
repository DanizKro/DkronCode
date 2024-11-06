package ProveOppg5;

public class ToDoListe {

	
	private ToDoElement[] todoTab; // privat klassevariabel
	
	private int antall;
	
	
	public ToDoListe(int maksAntall) {				
		
		todoTab = new ToDoElement[maksAntall];
		antall = 0;
	}
	
	public void leggTil(ToDoElement tde) {
		
		if (antall < todoTab.length) {
			todoTab[antall] = tde;
			antall++;
		}else {
			System.out.print("Det er ikke plass i tabellen");
		} 
	}
	
	public ToDoElement finnViktig() {
		
		int tall = Integer.MAX_VALUE;
		int index = 0;
	
		for (int i = 0; i < antall; i++) {
			
			if(todoTab[i].getPrioritet() < tall) {
				tall = todoTab[i].getPrioritet();
				index = i;
			}
		} return todoTab[index];
	}
	
	
	
}
