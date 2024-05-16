package b_model;

public enum Marca {
	
	TOYOTA("Toyota"), 
	HONDA("Honda"), 
	BMW("BMW"), 
	FIAT("Fiat"), 
	MERCEDES("Mercedes"), 
	FERRARI("Ferrari");
	
	private String nomeMarca;

	Marca(String nomeMarca) {
		this.nomeMarca=nomeMarca;
	}
	
	public String getNomeMarca() {
		return nomeMarca;
	}
}
