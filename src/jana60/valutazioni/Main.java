package jana60.valutazioni;

/*
 * Classe Main con metodo main in cui create un array di studenti
 * (i dati degli studenti possono essere chiesti all’utente oppure 
 * inseriti nel codice con dei valori di test). 
 * L’id di ogni studente deve essere univoco nell’array (possiamo usare un numero progressivo). 
 * Il programma deve poi stampare a video per ogni studente se è stato promosso o bocciato 
 * e quanti studenti sono stati promossi in tutto.
 */
public class Main {

	public static void main(String[] args) {

		Studente studente1 = new Studente(1, 10, 1);
		Studente studente2 = new Studente(2, 20, 2);
		Studente studente3 = new Studente(3, 30, 3);
		Studente studente4 = new Studente(4, 40, 4);
		Studente studente5 = new Studente(5, 50, 5);
		Studente studente6 = new Studente(1, 60, 1);
		Studente studente7 = new Studente(2, 70, 2);
		Studente studente8 = new Studente(3, 80, 3);
		Studente studente9 = new Studente(4, 90, 4);
		Studente studente10 = new Studente(5, 100, 5);

		Studente[] studenti = { studente1, studente2, studente3, studente4, studente5, studente6, studente7, studente8,
				studente9, studente10 };

		// stampo i vari esiti degli studenti
		for (int i = 0; i < studenti.length; i++) {
			studenti[i].stampaValutazione();
		}

		// conto e stampo il numero di studenti promossi
		int counter = 0;
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].esitoValutazione() == "promosso") {
				counter += 1;
			}
		}
		System.out.println("Gli studenti promossi sono: " + counter);

	}

}
