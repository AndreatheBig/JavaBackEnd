package Model;

import java.time.LocalDate;

public class Note {
	
	private String titolo;
	private String corpo;
	public LocalDate data;
	
	public Note () {
		
	}
	
	/**
	 * @param titolo
	 * @param corpo
	 */
	public Note(String titolo, String corpo) {
		super();
		this.titolo = titolo;
		this.corpo = corpo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	@Override
	public String toString() {
		return "Note [Titolo:" + titolo + ", Corpo:" + corpo +", Data:"+ data +"]";
	}
	
	
	

}
