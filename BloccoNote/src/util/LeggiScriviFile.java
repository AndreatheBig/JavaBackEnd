package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LeggiScriviFile {

//	f è il file, sorgente è il contenuto
	public static void scrivi(File f, String sorgente) {
		
		try {
			PrintWriter out = new PrintWriter(f);
			out.print(sorgente);
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Non trovo il file");
			e.printStackTrace();
		}
		
	}
	
}