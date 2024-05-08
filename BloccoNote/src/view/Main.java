package view;

import java.io.File;
import java.util.Scanner;

import model.Note;
import util.LeggiScriviFile;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String comando=s.nextLine();
		
		
		System.out.println("Blocco Note");
		System.out.println("Vuoi inserire una nuova nota?");
		
	
		Note n = new Note();
		n.setTitolo(s.nextLine());
		n.setTesto(s.nextLine());
		n.getData();
		

		File destinazioneTXT = new File("./nuovofile.txt");
		LeggiScriviFile.scrivi(destinazioneTXT, n.GeneraTXT());
				
	}
}