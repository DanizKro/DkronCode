package ProveOppg5;

public class ToDoListe {

	
	private ToDoElement[] todoTab;
	
	private int antall;
	
	
	public ToDoListe(int maksAntall) {
		
		todoTab = new ToDoElement[maksAntall];
		antall = 0;
	}
	
	public void leggTil(ToDoElement tde) {
		
		if (todoTab.length < antall) {
			todoTab[antall] = tde;
		}else {
			System.out.print("Det er ikke plass i tabellen");
		} 
	}
	
	ToDoElement finnViktig() {
		
		int tall = 0;
		for (int i = 0; i < todoTab.length; i++) {
			
			if(todoTab[i].getPrioritet() < todoTab[i+1].getPrioritet()) {
				tall = i;
			}
		} return todoTab[tall];
	}
	
	
	
}
