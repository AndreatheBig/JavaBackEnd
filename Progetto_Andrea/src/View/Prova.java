package View;

import java.util.Scanner;

import Controller.BloccoNote;

public class Prova extends BloccoNote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BloccoNote B = new BloccoNote();
		
		System.out.println("Benvenuto nel tuo blocco note");
		System.out.println("Attualmente ci sono: "+ B.dimensioni());
		System.out.println("Cosa vuoi fare?");
		System.out.println("1►crea una nuova nota");
		System.out.println("2►modifica una nota");
		System.out.println("3►leggi una nota");
		System.out.println("4►elimina tutte le note");
		
		while
		
		int CTRL = sc.nextInt();
		sc.nextLine();
		
		switch (CTRL) {
			case 1:B.AddNota();
				break;
			case 2:
				break;
			case 3:B.trovaNote();
				break;
			case 4:B.piallaNote();
				break;
		}
		
	}

}
