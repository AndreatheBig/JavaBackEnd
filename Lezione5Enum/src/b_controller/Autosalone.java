package b_controller;

import java.util.ArrayList;

import b_model.Automobile;
import b_model.Colore;
import b_model.Marca;
import b_model.Modello;
import b_model.Modello_Honda;

public class Autosalone {
	
	private String nomeAutosalone;
	private ArrayList<Automobile> autoDisponibili = new ArrayList<Automobile>();
	/**
	 * @param nomeAutosalone
	 */
	public Autosalone(String nomeAutosalone) {
		
		this.nomeAutosalone = nomeAutosalone;
		
		autoDisponibili.add(new Automobile(Modello.CIVIC, Marca.HONDA,Colore.ORANGE, 1400));
		autoDisponibili.add(new Automobile(Modello.M3, Marca.BMW,Colore.GREEN, 4000));
		
	}
	
	public void addAuto() {
		Automobile nuovaAuto = new Automobile();
		
		nuovaAuto.setMarca(Marca.HONDA);
		if(nuovaAuto.getMarca().equals("Honda")) {
			nuovaAuto.setModello(Modello_Honda.JAZZ);
		}
		
	}
	

}
