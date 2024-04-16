package OOP_model;

public class Motocicletta {
	
	public String marca="Kawasaki";
	public String modello;
	public int cilindrata;
	public byte ruotemotrici=1;
	public boolean isAcceso=false;
	
	public Motocicletta (String modello,int cilindrata) {
		this.modello=modello;
		this.cilindrata=cilindrata;
	}

	@Override
	public String toString() {
		return "Motocicletta [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", ruotemotrici=" + ruotemotrici + ", isAcceso=" + isAcceso + "]";
	}
	

}
