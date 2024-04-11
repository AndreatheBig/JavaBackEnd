package a_eserciziocalcolatrice;

public class A_calcolatrice {
	
	double num1;
	double num2;
	
	
	
	public A_calcolatrice(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double calcolasomma () {
		double somma = this.num1 + this.num2;
		return somma;	
	}
	public double calcolasottrazione () {
		double sottrazione = this.num1 - this.num2;
		return sottrazione;
	}
	public double calcolamoltiplicazione () {
		double moltiplicazione = this.num1 * this.num2;
		return moltiplicazione;
	}
	public double calcoladivisione () {
		double divisione = this.num1 / this.num2;
		return divisione;
	}
	
	public double calcola(String operatore) {
		double risultato = 0;
		
//		in base all'operatore eseguo un metodo
		if (operatore=="+") {
			calcolasomma();
		}else if(operatore=="-") {
			calcolasottrazione ();
		}else if(operatore=="*") {
			calcolamoltiplicazione ();
		}else if(operatore=="/") {
			calcoladivisione ();
		}else {
			
		}
			
		return risultato;
	}
	
	public static void main(String[] args) {
		
		A_calcolatrice calcolatrice = new A_calcolatrice(10.2, 5.1);
		
		System.out.println("somma "+calcolatrice.calcolasomma());
		System.out.println("sottrazione"+calcolatrice.calcolasottrazione());
		System.out.println("moltiplicazione"+calcolatrice.calcolamoltiplicazione());
		System.out.println("divisione"+calcolatrice.calcoladivisione());
		System.out.println("Il risulato dell'operazione è: " + calcolatrice.calcola("+"));
	}

}
