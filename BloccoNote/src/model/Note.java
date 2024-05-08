package model;

import java.time.LocalDateTime;

public class Note implements GeneratoreFileTXT {
	
	private String titolo;
	private String testo;
	private LocalDateTime data = LocalDateTime.now();
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public LocalDateTime getData() {
		return data;
	}
	@Override
	public String GeneraTXT() {
		String TXT = " "+getTitolo()+" \n "+getTesto()+" \n "+getData(); 
		return TXT;
	}
	
	
	
	
	
}
