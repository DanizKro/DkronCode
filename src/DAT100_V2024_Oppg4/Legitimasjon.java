package DAT100_V2024_Oppg4;

public abstract class Legitimasjon {

		private String navn;
		private boolean validert;
		
		public Legitimasjon(String navn) {
			this.navn = navn;
			validert = false;
		}
		
		//Setters
		public void setNavn(String navn) {
			this.navn = navn;
		}
		public void setValidert(boolean validert) {
			this.validert = validert;
		}
		//Getters
		public boolean getValidert() {
			return validert;
		}
		public String getNavn() {
			return navn;
		}
		
		public void Valider() {
			
		}
	
		
	
	
}
