package DAT100_V2024_Oppg4;

public class MainForerkort {

	public static void main(String[] args) {
		
		Forerkort forerkort = new Forerkort("Daniel", "123456789", "10.10.24");
		
		forerkort.valider();
		
		forerkort.visKryptert();
	}
	
}
