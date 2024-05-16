package a_colore;

public class Main {

	public static void main(String[] args) {
		
		Colore primoColore= Colore.BLACK;
		Colore secondoColore= Colore.GREEN;
		System.out.println(secondoColore.getNomeIta());
		
		switch (primoColore) {
		case BLACK: 
			System.out.println("Hai scelto il colore: "+primoColore.getNomeIta());
			break;
		case RED:
			System.out.println("Hai scelto il colore: "+primoColore.getNomeIta());
			break;
			default:
				throw new IllegalArgumentException("unexpeted value: "+primoColore);
		}
		

	}

}
