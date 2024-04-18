package dadiTest;

import java.util.ArrayList;
import java.util.Scanner;

import dadiModel.Dadi;

public class Daditester {

	public static void cheatmode(int ris1, int ris2, int ris3) {
		superlucky(ris1, ris2, ris3);
	}
	public static int superlucky(int ris1, int ris2, int ris3) {
		int punteggio = 0;

		if (ris1 == ris2 && ris2 == ris3) {
			punteggio += 100;
		}

		return punteggio;
	}

	public static int calcoloRisultato(int ris1, int ris2, int ris3) {
		int somma;
		int punteggio = 0;
		somma = ris1 + ris2 + ris3;

		ArrayList<Integer> lanci = new ArrayList<>();
		lanci.add(ris1);
		lanci.add(ris2);
		lanci.add(ris3);

		if (somma >= 26) {
			punteggio += 10;
		}
		for (Integer lancioSingolo : lanci) {
			if (lancioSingolo % 2 == 0) {
				punteggio += 6;
			}
		}
		System.out.println("dado da 6 hai ottenuto " + ris1);
		System.out.println("dado da 12 hai ottenuto " + ris2);
		System.out.println("dado da 20 hai ottenuto " + ris3);
		System.out.println("la somma dei tuoi lanci è " + somma);
		System.out.println("il tuo punteggio è " + punteggio);
		return punteggio;
	}

	public static void main(String[] args) {

		System.out.println("In che modalita vuoi giocare 'SuperLUCKY' o 'NORMALE'   ");
		System.out.println("inserisce l per la SuperLUCKY o n per la NORMALE");

		Scanner s = new Scanner(System.in);
		String modalita = s.nextLine();

		Dadi dado1 = new Dadi(6);
		Dadi dado2 = new Dadi(12);
		Dadi dado3 = new Dadi(20);

		int risultatoFinale = 0;

		if (modalita.equalsIgnoreCase("l")) {

			int ris1 = dado1.lancia();
			int ris2 = dado2.lancia();
			int ris3 = dado3.lancia();

			risultatoFinale = superlucky(ris1, ris2, ris3) + calcoloRisultato(ris1, ris2, ris3);
		} else if (modalita.equalsIgnoreCase("n")) {

			int ris1 = dado1.lancia();
			int ris2 = dado2.lancia();
			int ris3 = dado3.lancia();

			calcoloRisultato(ris1, ris2, ris3);
		} else if (modalita.equalsIgnoreCase("pippo")) {

			int ris1 = dado1.cheat();
			int ris2 = dado2.cheat();
			int ris3 = dado3.cheat();

			cheatmode(ris1, ris2, ris3);

		} else {
			System.out.println("inserimento non valido");
		}

		System.out.println(risultatoFinale);

	}

}
