package dadiModel;

import java.util.Random;

public class Dadi {
	
	int numFacce;
	public int numRandom;
	

		public Dadi(int numFacce) {
		super();
		
		this.numFacce = numFacce;
	}
		
	

		public int lancia() {
			Random r=new Random();					
			numRandom=r.nextInt(1,(numFacce+1));
			return numRandom;
	}
		
		public int cheat() {
			Random r=new Random();					
			numRandom=r.nextInt(3,6);
			return numRandom;
		}
}
