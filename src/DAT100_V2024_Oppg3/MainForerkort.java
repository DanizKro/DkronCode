package DAT100_V2024_Oppg3;

public class MainForerkort {

	public static void main(String[] args) {
		
		Forerkort forerkort = new Forerkort("Martin", "123456789", "10.10.24");
		
		forerkort.valider();
		
		forerkort.visKryptert();
		
	}
	
	
}
