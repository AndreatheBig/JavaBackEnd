package OOP_Tester;

import OOP_model.Motocicletta;

public class MotociclettaTester {

	public static void main(String[] args) {
		// ATT ATT: per poter utulizzare un costruttore di default 
		//essendo in presenza di un costruttore con parametri, devo
		//obbligatoriamente dichiararlo nel model 
		Motocicletta moto1 = new Motocicletta("Z750",749);
		Motocicletta moto2 = new Motocicletta("Ninja",1000);
		Motocicletta moto3 = new Motocicletta("Z800",799);
		
		//ATT: la classe motocicletta ha delle Proprieta senza modificatore di accesso
		//(default). Con il modificatore di default le prop sono accessibili solo all'
		// interno dello stesso package.
		//ATT il modello to string e il costruttore è un metodo public, quindi
		//visibile in tutto il package
		
		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(moto3.toString());
	}

}
