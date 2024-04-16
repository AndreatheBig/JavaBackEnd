package A_OOP;

public class Automobile {
	
	String marca="fiat";
	String modello;
	int cilindrata;
	byte ruoteMotrici=2;
	boolean statoMotore=false;
	
	
	//specificare un costruttore di default
	public Automobile () {}
	
	// specifico un costruttore per una careatteristica 
	public Automobile (String marca) {
		this.marca=marca;
	}
	public Automobile (String marca, String modello, int cilindrata) {
		this.marca=marca;
		this.modello=modello;
		this.cilindrata=cilindrata;
}
// alt+shift+s generate constructor using field
	public Automobile(String marca, String modello, int cilindrata, byte ruoteMotrici, boolean statoMotore) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.ruoteMotrici = ruoteMotrici;
		this.statoMotore = statoMotore;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", ruoteMotrici="
				+ ruoteMotrici + ", statoMotore=" + statoMotore + "]";
	}
	
}