package DAT100_V2023_Oppg4;

public class TelefonKoe {

	
	private Person[] person;
	
	private int antall;
	
	
	public TelefonKoe(int maksantall) {
		
		person = new Person[maksantall];
		antall = 0;
	}
	
	public void vis() {
		
		for(int i = 0; i < antall; i++) {
			System.out.print("[" + (i+1) + "]" + person[i].getNavn());
		}
	}
	
	public boolean settinn(Person p) {
		
		if(antall < person.length) {
			person[antall] = p;
			antall++;
			return true;
		} else return false;
	}
	
	public Person neste() {
		
//		if(person[0].getNavn().equals("null")) {
//			return null;
//		} else return person[0];
		
		if(antall > 0) {
			return person[0];
		} return null;
	}
	
	public void fjern() {
		
		if (antall > 0) {
			
			for(int i = 1; i < antall; i++) {
				person[i-1] = person[i];
			}
			// antall--; (Kan bytte om på de)
			person[antall-1] = null; 			// VIKTIG! Hvis du sletter siste antall-1 = null, så må antall reduseres etterpå
												// du kan redusere antall-1, så sette person[antall] = null, for gjøre klar
		} //person[antall] = null;
		antall--;								// "nesteLedig".
	}
	
	public int nummer(String navn) {
		
		int nummer = 0;
		
		for (int i = 0; i < antall; i++) {
			if(person[i].toString().equals(navn)) {
				return nummer = i+1;							//Må ta høyde for posisjon 1 er laveste i køen
			}
		}  return nummer;
	}
	
	
	
	
}
