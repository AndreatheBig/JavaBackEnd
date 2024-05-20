package view;

import controller.PokemonCTRL;

public class PokemonView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokemonCTRL controller=new PokemonCTRL();
		
		controller
		.getTipiPokemon()
		.forEach(p->System.out.println(p));

		
		controller
		.getNomiPokemon()
		.stream()
		.sorted()
		.forEach(p-> System.out.println(p));
	}

}
