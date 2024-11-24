package DAT100_V2022_Oppg4;

public class Observasjoner {

	// 4a)
	private Observasjon[] obs;
	private int antall;
	private int nr;

	public Observasjoner(int maksAntall) {

		obs = new Observasjon[maksAntall];

		antall = 0;
		nr = 0;
	}

	private boolean leggTil(Observasjon o) {

		boolean svar = false;

		if (antall < obs.length) {
			obs[antall] = o;
			antall++;
			svar = true;
		}
		return svar;
	}

	public boolean registrer(double t, double f, int co2) {

		Observasjon obs1 = new Observasjon(t, f, co2);

		boolean svar = false;

		if (antall < obs.length) {

			svar = leggTil(obs1);
			nr++;
		}
		return svar;
	}

	public void print() {

		for (int i = 0; i < obs.length; i++) {
			System.out.print(obs[i].toString);
		}
	}
	
	private int finnes(int nr) {
		
		int funnet = -1;
		
		for(int i = 0; i < obs.length; i++) {
			
			if(obs[i].getNr == nr) {
				funnet = i;
				break;
			}
		} return funnet;
	}
	
	public boolean slett(int nr) {
		
		int index = finnes(nr);
		
		if(index != -1) {
			obs[i] = obs[antall-1];
			obs[antall-1] = null;
			antall--;
		}
		return (index!=-1);
	}
	
	public int maxCO2() {
		
		int max = -1;
		
		for(int i = 0; i < antall; i++) {			// MÅ være antall pga nullpeker obs.getCo2 kresjer programmet
			max = Integer.max(i, obs[i].getCo2());	// kan ikke være obs.length!!!
		} 
		return max;
	}
	
	public double[] temperaturer() {
		
		double[] tab = new double[antall];
		
		for(int i = 0; i < antall; i++) {
			
			tab[i] = obs[i].getTemperaturer();
		}
		return tab;
	}
	
	
	
	
	
	
	
	
	
	

}
