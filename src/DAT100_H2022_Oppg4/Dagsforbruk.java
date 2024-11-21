package DAT100_H2022_Oppg4;

public class Dagsforbruk {

	
	// 4a)
	Avlesing[] avlesing;
	
	
	// 4b)
	public Dagsforbruk() {
		
		avlesing = new Avlesing[24];
	}
	
	// 4c)
	public void registrerAvlesing(int time, Avlesing avl) {
		
		if(time > 0 && time < 25) {
		avlesing[time-1] = avl;								// hvis time starter på 1 , må vi trekke fra 1 for
		} else {											// å få plassering 0 i tabellen.
			System.out.print("Ugyldig time-variabel");
		}
	}
	// 4d)
	public void visForbruk() {
		
		for(int i = 0; i < avlesing.length; i++) {
			if(avlesing[i] == null) {						// Equals metode sjekker innholdet
				System.out.println("Ikke registrert");		// Vi skal sjekke om de peker på samme derfor ==
			} else {
				System.out.println(avlesing[i].getTotalkwh());
			}
		}
	}
	
	// 4e)
	
	public boolean altRegistrert() {
	
		boolean svar = false;
		
		//sjekke hvert element i tabellen, om den inneholder en null peker (om den ike er full)
		for(int i = 0; i < avlesing.length; i++) {
			if(avlesing[i] == null) {						
				svar = false;
			} else {
				svar = true;
			}
			// Alternativ kan vi bare sjekke siste plass om vi antar at tabellen er registrert i rekkefølge
			// return (avlesing[avlesing.length-1] == null)
	} return svar;	
}
	
	public int finnMaksKwh() {
		
		int maks = 0;
		
		for(int i = 0; i < avlesing.length; i++) {
			if(avlesing[i] != null) {
				maks = Integer.max(maks, avlesing[i].getForbrukkwh());
			}
		} return maks;
	}
	
	public double gnsKwh() {
		
		double sum = 0;
		int n = 0;
		
		for(int i = 0; i <avlesing.length; i++) {
			if(avlesing[i] != null) {
			sum += avlesing[i].getForbrukkwh();
			n++;
			}
		} return (sum/n);
	} 
	
	public double beregnPris(double[] timepriser) {
		
		double pris = 0;
		
		for(int i = 0; i < avlesing.length; i++) {
			pris = avlesing[i].getForbrukkwh() * timepriser[i];
		}
		return pris;
	}
	
	
	
	
	
	
	
	
	
}

