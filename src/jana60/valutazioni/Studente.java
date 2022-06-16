package jana60.valutazioni;

public class Studente {

	/*
	 * Classe Studente con tre attributi: id dello studente (intero), percentuale
	 * assenze (intero), media voti (numero decimale). La classe deve avere un
	 * costruttore con parametri e anche un metodo che calcola, in base a
	 * percentuale delle assenze e media dei voti, se lo studente è promosso o
	 * bocciato.
	 * 
	 * La valutazione complessiva viene fatta sulla percentuale di assenze (da 0 a
	 * 100) e sulla media dei voti (da 0 a 5): 1) se lo studente ha fatto più del
	 * 50% di assenze è bocciato; 2) se ha fatto tra il 25% e il 50% di assenze è
	 * promosso solo se la media dei voti è superiore a 2; 3) se ha fatto meno del
	 * 25% di assenze è promosso se la media dei voti è superiore o uguale a 2.
	 */

	// attributi
	int idStudente;
	int percAssenze;
	double mediaVoti;

	// costruttori
	Studente(int idStudente, int percAssenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.percAssenze = percAssenze;
		this.mediaVoti = mediaVoti;
	}

	// metodi
	boolean valutazioneStudenti() {
		boolean promosso;
		if (percAssenze > 50) {
			promosso = false;
		} else if (percAssenze <= 50 && percAssenze >= 25 && mediaVoti > 2) {
			promosso = true;
		} else if (percAssenze < 25 && mediaVoti >= 2) {
			promosso = true;
		} else {
			promosso = false;
		}
		return promosso;
	}

	String esitoValutazione() {
		if (valutazioneStudenti()) {
			return "promosso";
		} else {
			return "bocciato";
		}

	}

	void stampaValutazione() {
		System.out.println("Lo studente di matricola numero " + idStudente + " è stato " + esitoValutazione());

	}

}
