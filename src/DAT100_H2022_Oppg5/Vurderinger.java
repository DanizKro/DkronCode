package DAT100_H2022_Oppg5;

public class Vurderinger {

	// ikke i eksamensoppgaven, men for testing
	public static void main(String[] args) {

		Vurderinger tab = new Vurderinger(3, 4);

		tab.vis();
	}
	
	private char[][] innleveringer;

	public Vurderinger(int studentantall, int oppgaveantall) {

		// Antar at studenter er første kolonne
		innleveringer = new char[studentantall][oppgaveantall];
	}

	public char hentStatus(int s, int o) {

		return innleveringer[s][o];
	}

	public void sett(int s, int o, char status) {

		innleveringer[s][o] = status;
	}

	public boolean erGodkjent(int s, int o) { // Endret fra void til boolean for å returnere boolean verdi

		boolean godkjent = false;

		if (hentStatus(s, o) == 'G') {
			godkjent = true;
		}
		return godkjent;
		// Alt: return (hentStatus(s,o) == ('G');
	}

	public void vis() {

		for(int i = 0; i < innleveringer.length; i++) {
			System.out.print(i);
			for(int j = 0; j < innleveringer[i].length; j++) {
				System.out.print("|");
				if(innleveringer[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(hentStatus(i,j));
				}
			} System.out.println("|");
		}
	}
	
	public boolean alleLevert(int o) {
		
		for(int i = 0; i < innleveringer.length; i++) {
			
			if(innleveringer[i][o] == 0) {
				return false;
			}
		} return true;
	}
	
	
	
	
	
	
}
