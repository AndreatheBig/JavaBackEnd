package A_OOP;

public class AutomobileTester {
 public static void main (String[] args) {
	 // qui dentro creo tutte le auto che voglio 
	 
	 // COSTRUTTORE DI DEFAULT
	 Automobile auto1 = new Automobile();
	 System.out.println(auto1.marca);
	 System.out.println(auto1.cilindrata);
	 
	 auto1.cilindrata=1200;
	 System.out.println(auto1.cilindrata);
	 
	 //utilizzo il costruttore con marca modello e cilindrata
	 Automobile auto2 = new Automobile("Opel", "Astra", 1600);
	 System.out.println(auto2.marca);
	 
	Automobile auto3 = new Automobile("Peugeot", "206", 1200 , (byte)2, false);
	
	System.out.println(auto3.toString());
	 
 }
}
