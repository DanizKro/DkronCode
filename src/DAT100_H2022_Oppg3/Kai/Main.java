package DAT100_H2022_Oppg3.Kai;

public class Main {
    public static void main(String[] args) {
        Forespørsel forespørsel1 = new Forespørsel(1, Forespørsel.Måling.TEMPERATUR);
        Forespørsel forespørsel2 = new Forespørsel(2, Forespørsel.Måling.FUKTIGHET);
        Forespørsel forespørsel3 = new Forespørsel(3, Forespørsel.Måling.CO2);

        Svar svar1Temp = new Svar(forespørsel1.getMid(),20.0);
        Svar svar1Fukt = new Svar(forespørsel1.getMid(),67.0);
        Svar svar1Co2 = new Svar(forespørsel1.getMid(),2.3);

        Svar svar2Temp = new Svar(forespørsel2.getMid(),22.0);
        Svar svar2Fukt = new Svar(forespørsel2.getMid(),70.0);
        Svar svar2Co2 = new Svar(forespørsel2.getMid(),2.5);

        Svar svar3Temp = new Svar(forespørsel3.getMid(),18.0);
        Svar svar3Fukt = new Svar(forespørsel3.getMid(),65.0);
        Svar svar3Co2 = new Svar(forespørsel3.getMid(),2.0);

        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println(forespørsel1.getClass().getSimpleName() + " Object " + forespørsel1.getMid());
        System.out.println(forespørsel1 + " | " + svar1Temp + " | " + svar1Fukt + " | " + svar1Co2);
        System.out.println("------------------------------------------------------------------");

        System.out.println(forespørsel2.getClass().getSimpleName() + " Object " + forespørsel2.getMid());
        System.out.println(forespørsel2 + " | " + svar2Temp + " | " + svar2Fukt + " | " + svar2Co2);
        System.out.println("------------------------------------------------------------------");

        System.out.println(forespørsel3.getClass().getSimpleName() + " Object " + forespørsel3.getMid());
        System.out.println(forespørsel3 + " | " + svar3Temp + " | " + svar3Fukt + " | " + svar3Co2);
        System.out.println("------------------------------------------------------------------");

        System.out.println(svar1Temp.getClass().getSimpleName() + "-object");
        System.out.println(svar1Temp);
        System.out.println(svar2Fukt);
        System.out.println(svar3Co2);
        System.out.println();
    }
}
