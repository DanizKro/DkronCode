package ProveOppg5;

public class Main {

	public static void main(String[] args) {
		
		ToDoListe toDoListe = new ToDoListe(10); //instansiert objekt på en klasse!
		
		ToDoElement toDoElement = new ToDoElement("daniel", 5, 2);
		toDoListe.leggTil(toDoElement);
		
		ToDoElement toDoElement2 = new ToDoElement("riktig", 2, 1); //toDoElement2 er bare et navn
		toDoListe.leggTil(toDoElement2);
		
		ToDoElement viktig = toDoListe.finnViktig();
		
		System.out.print(viktig.toString());
		
		
		
		
		
	}

}
