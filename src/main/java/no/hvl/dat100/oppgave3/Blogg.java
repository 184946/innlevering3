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
			if (!(tabell[i].equals(""))) {
				antall++;
			}
		} return antall;
	}
	
	public Innlegg[] getSamling() {
		return tabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i<tabell.length; i++) {
			if (innlegg.erLik(tabell[i])) {
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
		boolean nja = false;
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == null) {
				nja = true;
				 
			}
		} return nja;
	 

	}
	
	public boolean leggTil(Innlegg innlegg) {

		
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}
}