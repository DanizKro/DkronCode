package DAT100_V2023_Oppg3;

public class Etasje {

	
	private Rom[] navn1;
	
	private int etasje;
	
	private int nesteledig;
	
	
	public Etasje(int etasje, Rom[] rom) {
		
		this.etasje = etasje;
		this.navn1 = rom;
		
	}
	
	// Ikke i oppgaven
	public void lagTab(int storrelse) {
		
		navn1 = new Rom[storrelse];
		nesteledig++;
	}
	
	// Ikke i oppgaven
	public void leggTil(Rom tab) {
		
		if(nesteledig < navn1.length) {
			navn1[nesteledig] = tab;
			nesteledig++;
		} else
			System.out.print("ikke plass");
	}
	
	@Override
	public String toString() {
		
		String txt =  "Etasje " + etasje + "\n";
				
				for (int i = 0; i < navn1.length; i++) {
					txt +=navn1[i].toString();
				}
				
		return txt;
	}
	
	
	
	
	
	
}
