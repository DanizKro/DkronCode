package Oppg4ProveEksamen;

public class Main {

	public static void main(String[] args) {
		
		//Oppretter en liste som har plass til datatypen DoToElement fra klassen ToDoElement
		
		ToDoListe listeNr1 = new ToDoListe(3);
		
		//Oppretter elementer fra ToDoElement klassen med konstruktør
		
		ToDoElement navn1 = new ToDoElement("Frankrike tur", 47951948, 4);
		ToDoElement navn2 = new ToDoElement("Spania tur", 47951948, 3);
		ToDoElement navn3 = new ToDoElement("USA tur", 47951948, 2);
		ToDoElement navn4 = new ToDoElement("Tyskland IT-konferanse", 47951948, 1);
		
		//Legger til Elementene laget fra ToDoElement klassen i listen laget fra ToDoListe classen.
		listeNr1.leggTil(navn1);
		listeNr1.leggTil(navn2);
		listeNr1.leggTil(navn3);
		listeNr1.leggTil(navn4);
		
		//Lager et nytt Element som metoden .finnViktig kan lagre peker til
		//Bruker metoden .finnviktig og den returnerte peker lagres i elementet med navn: viktigElement
		
		ToDoElement viktigElement = listeNr1.finnViktig();
		
		//Printer ut 
		
		System.out.println("");
		System.out.println("Viktigste turen:");
		System.out.print(viktigElement.toString());
}
}
