package OOP_Tester;

import java.util.Scanner;

import OOP_model.Bicicletta;

public class BiciclettaTester {

	public static void main(String[] args) {
		
		Bicicletta Bici1= new Bicicletta("Cannondale","c-bike" ,(byte)2,21);
		
		
		Bici1.accellera(100);
		Bici1.rallenta(60);
		Bici1.calcoloVelocitaMax();
		System.out.println(Bici1.toString());
		
		System.out.println();		
		System.out.println("altra bici");
		System.out.println();
		
		Bicicletta Bici2= new Bicicletta("Bianchi","Bartali" , (byte)2, 10);
		Bici2.accellera(800);
		Bici2.calcoloVelocitaMax();
		System.out.println(Bici2.toString());
		
		String miaMarca;
		String mioModello;
		
		Scanner sc = new Scanner(System.in);
		
		miaMarca=sc.nextLine();
		mioModello=sc.nextLine();
		
		
		
		
		

	}

}
