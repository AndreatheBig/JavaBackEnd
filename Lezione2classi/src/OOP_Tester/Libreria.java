package OOP_Tester;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OOP_model.Libro;

public class Libreria {

	public static void main(String[] args) {
		
		ArrayList<Libro> scaffale = new ArrayList<Libro>();
		
		//creo un nuovo libro e lo inserisco nello scaffale
		ArrayList<String> generiLibro1 = new ArrayList<String>();
		
		generiLibro1.add("Fantasy");
		generiLibro1.add("Avventura");
		Libro libro1 = new Libro("il signore degli anelli", "J.R.Tolkien", generiLibro1,1200, "Utet", false, 16.80);

		scaffale.add(libro1);
		
		
		
		ArrayList<String> generiLibro2 = new ArrayList<String>();
		generiLibro2.add("avventura");
		generiLibro2.add("Fantastico");
		
		Libro libro2 = new Libro("Il visconte Dimezzato", "I.Calvino", generiLibro2, 150, "Feltrinelli", true, 12.50);
		System.out.println("Comandi utente: t per titolo, s per stampare tutti i libri nello scaffale");
		scaffale.add(libro2);
		Scanner input = new Scanner(System.in);
		
		String comando= input.nextLine();
		boolean trovato=false;
		
		while (!comando.equals("0")) {
			
			if(comando.equals("t")) {
				System.out.println("caro utente inserisci un titolo");
				String titolo=input.nextLine();
				
					for (Libro libro : scaffale) {
						if(libro.titolo.equals(titolo)) {	
							System.out.println("libro trovato");
							System.out.println(libro.toString());
							comando=true;
						}else{
							System.out.println("mi spiace, questo titolo non esiste");
						}
					}
			}else if(comando.equals("s")){
				System.out.println("Stampa tutti i libri");
					for (Libro libro : scaffale) {	
						System.out.println(libro);
					}
					
			}
			comando=input.nextLine();	
		}
		
	}

}
