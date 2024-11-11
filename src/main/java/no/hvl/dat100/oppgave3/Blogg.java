package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] tabell;
	private int nesteledig;
	
	
	public Blogg() {
		tabell = new Innlegg[20];
	}
		

	public Blogg(int lengde) {
		tabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall=0;
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] != null) {
				antall++;
			}
		} return antall;
	}
	
	public Innlegg[] getSamling() {
		return tabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] != null && innlegg.erLik(tabell[i])) {
				return i;
			}
			} return -1;
			
		}

		
	

	public boolean finnes(Innlegg innlegg) {
		
		boolean nja = false;
		if (finnInnlegg(innlegg) != -1) {
			nja = true;
		} return nja;


	}

	public boolean ledigPlass() {
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == null) {
				return true;
				 
			}
		} return false;
	 

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg) == false && ledigPlass() == true) {
			for (int i=0; i<tabell.length; i++) {
				if (tabell[i] == null) {
				tabell[i] = innlegg;
				return true;
			}}

			}return false;

		
	}
	
	public String toString() {
		String str = "";
		str = String.valueOf(getAntall()) + "\n";
		for (Innlegg innlegg : tabell) {
			if (innlegg != null) {
				str += innlegg.toString();
			}
		}return str;

	}
}