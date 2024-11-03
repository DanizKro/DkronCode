
package GPSprosjekt;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSDataConverter;

public class Oppg2 {

	
	public static void main(String[] args) {
		
		String txt = "2017-08-13T08:52:26.000Z";
		
	
		int mins = Integer.parseInt(txt.substring(14, 16))*60;
		
		System.out.println(Oppg2.toSeconds(txt));
		
		
	}
	

	public static int toSeconds(String timestr) {
		
		int mins = Integer.parseInt(timestr.substring(14, 16))*60;
		int timer = Integer.parseInt(timestr.substring(11, 13))*60*60;
		int sek = Integer.parseInt(timestr.substring(17, 19));
	
		int secs = mins + timer + sek;
	
		return secs;
		
	}
	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		
		// Bruker metoden toSeconds for å konvertere tid
		int time = GPSDataConverter.toSeconds(timeStr);
	
		// Konverter latitude, longitude og elevation til double
        double latitude = Double.parseDouble(latitudeStr);
        double longitude = Double.parseDouble(longitudeStr);
        double elevation = Double.parseDouble(elevationStr);

        // Opprett et GPSPoint objekt
        return new GPSPoint(time, latitude, longitude, elevation);

		
		
	}
}
