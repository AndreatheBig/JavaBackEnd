package b_model;

public class Automobile {
	
	private Modello modello;
	private Marca marca;
	private Colore colore;
	
	private int cilindrata;


	public Automobile(Modello modello, Marca marca, Colore colore, int cilindrata) {
		super();
		this.modello = modello;
		this.marca = marca;
		this.colore = colore;
		this.cilindrata = cilindrata;
	}


	public Automobile() {
		// TODO Auto-generated constructor stub
	}


	public Modello getModello() {
		return modello;
	}


	public void setModello(Modello modello) {
		this.modello = modello;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public Colore getColore() {
		return colore;
	}


	public void setColore(Colore colore) {
		this.colore = colore;
	}


	public int getCilindrata() {
		return cilindrata;
	}


	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void setModello(Modello_Honda modelloHonda) {
		this.modello=modello;
	}



	

}
