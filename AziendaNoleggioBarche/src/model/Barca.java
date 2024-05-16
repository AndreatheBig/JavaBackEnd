package model;

public class Barca {
	
	private int id;
	private String tipologia;
	private String nome;
	private char disponibile;
	private double costo;
	
	public Barca() {}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getDisponibile() {
		return disponibile;
	}

	public void setDisponibile(char disponibile) {
		this.disponibile = disponibile;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Barca id=" + id + "\ntipologia=" + tipologia + "\nnome=" + nome + "\ndisponibile=" + disponibile
				+ "\ncosto=" + costo + "]";
	};
	
	
	
	
	

}
