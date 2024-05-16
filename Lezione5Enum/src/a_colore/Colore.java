package a_colore;

public enum Colore {
	
	RED("Rosso"), 
	GREEN("Verde"), 
	BLUE("Blu"), 
	WHITE("Bianco"), 
	ORANGE("Arancio"), 
	BLACK("Nero");
	
	private String nomeIta;
	
	private Colore (String nomeIta) {
		this.nomeIta=nomeIta;
	}
	
	public String getNomeIta() {
		return nomeIta;
	}

}
