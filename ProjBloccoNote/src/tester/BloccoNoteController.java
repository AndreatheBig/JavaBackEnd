package tester;

import java.util.Scanner;

import model.BloccoNote;

public class BloccoNoteController {
	
	public static void main(String[] args) {
		
		BloccoNote blocco = new BloccoNote();
		
		System.out.println("Benvenuto nel tuo BloccoNote "+blocco.nome);
		System.out.println("aggiungi una nuova nota ");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Titolo:");
		String titolo=sc.nextLine();
		System.out.println("Descrizione:");
		String descrizione=sc.nextLine();
		System.out.println("Posizione");
		int posizione = sc.nextInt();
		
		blocco.addNota(titolo,descrizione,posizione);
		
		
		blocco.stampaBloccoNota();
		
	}

}
