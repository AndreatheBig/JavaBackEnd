package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Note;

public class BloccoNote {
	
	public String nome;
	ArrayList<Note> elencoNote = new ArrayList<>();
	
	
	
	public void AddNota() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Scrivi il titolo della nota:");
		String titolo=sc.nextLine();
		System.out.println("Ora puoi inserire la tua nota:");
		String corpo=sc.nextLine();
		Note n =new Note(titolo,corpo);	
		
	    elencoNote.add(n);
    }
	
	public void visualizzaNote() {
		for (Note note : elencoNote) {
			System.out.println(note);
		}
	}
	
	public void piallaNote() {
		elencoNote.clear();
	}	
	
	public Note trovaNote () {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inserisci titolo della nota:");
		
		Note n =new Note();
		
			for (Note note : elencoNote) {
				if(elencoNote.contains(sc.nextLine())) {
					System.out.println("Trovato");
					n=note;
				}else {
					System.out.println("Non c'è una nota con questo Titolo");				
				}
			}
			return n;
	}

	
	public Note modifiche () {	
		Note n=new Note();
		trovaNote();
		
	
	}
	
	public int dimensioni() {
		return elencoNote.size();
	 
	}
	
}
