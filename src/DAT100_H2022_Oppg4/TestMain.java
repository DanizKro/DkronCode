package DAT100_H2022_Oppg4;

public class TestMain {

	public static void main(String[] args) {
		
		Avlesing tab1 = new Avlesing(1, 232);
		Avlesing tab2 = new Avlesing(2, 134);
		Avlesing tab3 = new Avlesing(3, 232);
		Avlesing tab4 = new Avlesing(4, 334);
		
		Dagsforbruk dagsforbruk = new Dagsforbruk();
		
		dagsforbruk.registrerAvlesing(1, tab1);
		dagsforbruk.registrerAvlesing(2, tab2);
		dagsforbruk.registrerAvlesing(3, tab3);
		dagsforbruk.registrerAvlesing(4, tab4);
		
		// dagsforbruk.visForbruk();
		
		System.out.print(dagsforbruk.finnMaksKwh());
		
		// System.out.println(dagsforbruk.altRegistrert());
	}
}
