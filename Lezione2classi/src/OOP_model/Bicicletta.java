package OOP_model;

public class Bicicletta {
	String modello;
	String marca;
	byte ruote=2;
	double velocita=0;
	int frequenza=0;
	int numMarce;
	
	public Bicicletta(String modello, String marca, byte ruote, int numMarce) {
		this.modello=modello;
		this.marca=marca;
		this.ruote=ruote;
		this.numMarce=numMarce;
			
	}
	// avere piu costruttori si dice overlode
// modificatore tipo di ritorno nomeMetodo(parametri?)

	public void accellera(int incFrequenza) {
		frequenza=frequenza+incFrequenza;
		System.out.println("Stai accellerando la frequenza è: "+ frequenza);
	}
	
	public void rallenta(int incFrequenza) {
		frequenza=frequenza-incFrequenza;
		System.out.println("Stai rallentando la frequenza è: "+ frequenza);
		
	}
	
	public void calcoloVelocitaMax() {
		velocita=frequenza*numMarce;
		System.out.println("La velocità massima è "+velocita);
	}


	public String toString() {
		return "Bicicletta [modello=" + modello + ", marca=" + marca + ", ruote=" + ruote + ", velocita=" + velocita
				+ ", frequenza=" + frequenza + ", numMarce=" + numMarce + "]";
	}
	
}
