package a_classeintro;

public class RettangoloTest {
	
	//definisco degli attribbuti all'interno della mia classe
	
	int base;
	int altezza;
	
public static void main(String[] args) {
	//qui posso costruire l'oggetto rettangolo testutilizando la parola new
	// att quando uso la parola new sto facendo uso del costruttore di default.
	//i costruttori hanno lo STESSO NOME DELLA CLASSE.
	
	//creo un nuovo rettangolo istanza della classe rettangolotes;
		RettangoloTest rettangolo= new RettangoloTest();
		
		//pre dare valore al mio rettangolo assegno un valore con la notazione "punto".
			rettangolo.base=18;
			rettangolo.altezza=9;
			
			int area = rettangolo.altezza*rettangolo.base;
			int perimetro = (rettangolo.altezza+rettangolo.base)*2;
			
			System.out.println("l'altezza vale "+rettangolo.altezza);
			System.out.println("la base vale "+rettangolo.base);
			System.out.println("l'area del rettangolo "+area );
			System.out.println("il perimetro del rettangolo "+perimetro  );
	
			//istanzio un nuovo oggetto di tipo rettangolotest
	RettangoloTest rettangolo2 = new RettangoloTest();
		rettangolo2.altezza=8;
		rettangolo2.base=4;
	int area2=rettangolo2.base*rettangolo2.altezza;
	System.out.println("l'area del rettangolo2 Vale: "+area2);

	String  mammita="minchia a puois!";
	System.out.println(mammita);
	
	
	
}
}
