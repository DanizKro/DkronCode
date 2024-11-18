package DAT100_H2023_Høst_Oppg4;

public class Maalinger {
	
	// 4a)
	VaerData[] observasjon;
	
	private int antall;
	
	// 4b)
	public Maalinger(int maksantall) {
		
		observasjon = new VaerData[maksantall];
		antall = 0;
	}
	
	// 4c)
	public void skrivUt() {
		
		for (int i = 0; i < antall; i++) {
			System.out.println(observasjon[i].toString());
		}
	}
	
	// 4d)
	public VaerData hent(int pos) {
		
		if(pos < observasjon.length) {
			return observasjon[pos];
			
		} return null;
	}
	
	// 4e)
	
	public boolean settinn(VaerData v) {
		
		if(antall < observasjon.length) {
			observasjon[antall] = v;
			antall ++;
			return true;
			
		} return false;
	}
	
	// 4f)
	
	public VaerData slettSiste() {
		
		VaerData siste = null;							// Trenger ikke lage tabell, bare en objekt variabel (tom metode)
		
		if(antall > 0) {
			
			siste = observasjon[antall-1];				//Antall = neste ledig, antall-1 er siste elementet i tabellen
			observasjon[antall-1] = null;
			antall--;
		}
		return siste;
	}
	
	// 4g)
	public double hentTemperatur(int pos) {
		
//		if(pos < antall) {
//		
//		return observasjon[pos].getTemperatur();
//	}
//	throw new RuntimeException("Ulovelig posisjon");

		double temperatur = 0;
		
		try {
			if(pos < observasjon.length) {
				temperatur = observasjon[pos].getTemperatur();
			}
		} catch(Exception e) {
			System.out.print("Ulovelig posisjon");
			
		}
		return temperatur;
	}
	
	
	public boolean finnesOver(double temperatur) {
		
//		boolean svar = false;
//		
//		for(int i = 0; i < observasjon.length; i++) {
//			if(observasjon[i].getTemperatur() > temperatur) {
//				svar = true;
															//Bør legge til break; så den stopper å leite etter første funn
//			}												//da blir metodene like
//		} return svar;
		
		
		//Returnerer true om for FØRSTE temperatur som er høyere enn parameter
		boolean funnet = false;
		
		int i = 0 ;
		
		while(i < antall && !funnet) {
			if(observasjon[i].getTemperatur() > temperatur) { 	//Bruker metoden hentTemperatur, kan også observasjon[i].getTemperatur
				funnet = true;
			} i++;
		} 
			return funnet;
}
	
	public static void main (String[] args){
		
		
		
		Maalinger maaling = new Maalinger(10);
		
		VaerData n1 = new VaerData(22,22,22);
		
		maaling.settinn(n1);
		
		System.out.print(maaling.hentTemperatur(0));
		
		
	}
	
	
	
}
