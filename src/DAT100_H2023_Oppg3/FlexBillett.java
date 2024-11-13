package DAT100_H2023_Oppg3;

public class FlexBillett extends Billett{

	
	//3e)
	private int antall;
	
	public FlexBillett(String referanse, String navn, String tidspunkt) {
		super(referanse, navn, tidspunkt);
		antall = 3;
	}
	
	// 3f)
	@Override
	public String print() {
		
		return "Referanse: " + super.getReferanse() + "[" + antall + "]" + "\n" + 
				"Navn: " + super.getNavn() + "\n" +
				"Tid: " + super.getTidspunkt() + "\n";
	}
	
	// 3g)
	public boolean endreTidspunkt(String nytttidspunkt) {
		
		if (antall > 0) {
		super.setTidspunkt(nytttidspunkt);
		antall --;
		return true;
		}
		else {
			return false;
		}
	}
	
	//Hjelpemetode FAKE
	public static String genererReferanse() {
		return "fake referanse";
	}
	public static String showInputDialog(String txt) {
		return "fake string";
	}
	
	// 3h)
	public static FlexBillett hentInfo() {
		
		String referanse = genererReferanse();
		String navn = showInputDialog("Navn");
		String  tidspunkt = showInputDialog("Tidspunkt");
	
		FlexBillett billett = new FlexBillett(referanse,navn,tidspunkt);
		
		return billett;
	}
	
	// 3i)
	public static void main(String[] args) {
		
		FlexBillett billett = hentInfo();
		
		System.out.print(billett.print());
		
		String nyttTidspunkt = showInputDialog("Nytt tidspunkt: ");
		
		billett.endreTidspunkt(nyttTidspunkt);
		
		System.out.print(billett.print());
		
	}
	
}