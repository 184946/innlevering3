package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			// Oppretter en PrintWriter for å skrive til filen
			PrintWriter writer = new PrintWriter(mappe + "/" + filnavn);

			// Skriver blogginnholdet til filen ved å bruke toString-metoden
			writer.print(samling.toString());

			// Lukker skriveren
			writer.close();

			// Returnerer true hvis filen ble skrevet
			return true;
		} catch (FileNotFoundException e) {
			// Fanger opp eventuelle feil
			System.out.println("Feil ved skriving til fil: " + e.getMessage());
			return false;
		}
	}
}
