package DAT100_V2024_Oppg4;

public class ToDoListe {
	
	//IKKE EKSAMEN, bare test av oppgaven
	
	public static void main(String[] args) {
		
		Gjøremål s1 = new Gjøremål("Beskrivelse", 2);
		Gjøremål s2 = new Gjøremål("pc mus", 1);
		Gjøremål s3 = new Gjøremål("Skjøyter", 1);
		
		Gjøremål s4 = new Gjøremål("Dette er en beskrivelse", 2);
		Gjøremål s5 = new Gjøremål("Sykehs", 1);
		Gjøremål s6 = new Gjøremål("test2", 4);
		
		ToDoListe liste = new ToDoListe(3);
		
		
		liste.leggTil(s1);
		liste.leggTil(s2);
		liste.leggTil(s3);
		
		liste.vis();
		System.out.println();
		
		ToDoListe liste2 = new ToDoListe(5);
		
		liste2.leggTil(s4);
		liste2.leggTil(s5);
		liste2.leggTil(s6);
		
		liste2.vis();
	
	
		
	}
	
	
	
	
	
	
	
	
	Gjøremål[] gjøremål;
	
	private int antall;
	
	
	public ToDoListe(int maksantall) {
		
		gjøremål = new Gjøremål[maksantall];
		antall = 0;
	}
	
	public void vis() {
		
		for(int i = 0; i <antall; i++) {
			System.out.println(gjøremål[i].toString());
		}
	}
	
	
	public Gjøremål hent(int p) {
		
		if(p < antall) {
			return gjøremål[p];
		} else 
			return null;
	}
	
	public boolean leggTil(Gjøremål g) {
		
		if(antall < gjøremål.length) {
			gjøremål[antall] = g;
			antall++;
			return true;
		} return false;
	}
	
	public int harPrioritet(int prioritet) {
		
		int antall = 0;
		
		for(int i = 0; i < this.antall; i++) {
			
			if(gjøremål[i].getPrioritet() == prioritet) {
				antall++;
			}
		} return antall;
		
	}
	
	public Gjøremål[] finnViktigste() {
		
		int antall = harPrioritet(1);
		
		int pos = 0;
		
		Gjøremål[] viktig = new Gjøremål[antall];
		
		for(int i = 0; i < this.antall; i++) {
			if(gjøremål[i].getPrioritet() == 1) {
				viktig[pos] = gjøremål[i];
			}
		} return viktig;
	}
	
	public void leggTilListe(Gjøremål[] gjøremål) {
		
		Gjøremål[] nyListe = new Gjøremål[antall+gjøremål.length];
		
		int teller = 0;
		
		for(int i = 0; i < antall; i++) {
			nyListe[i] = this.gjøremål[i];
		}
		
		for(int i = 0; i < gjøremål.length; i++) {
			
			if(gjøremål[i] !=null)
			nyListe[antall+i] = gjøremål[i];
			teller++;
			
		}
			this.gjøremål = nyListe;
			this.antall += teller;
	}
	
	
	
	
	
}
