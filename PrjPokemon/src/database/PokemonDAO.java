package database;

import java.util.List;
import java.util.Map;

import model.Pokemon;

public interface PokemonDAO {
	
	String FINDALL="SELECT id, name,`type 1`,`type 2` FROM Pokemon";
	
	List<Pokemon>getAllPokemon();
	Map<Integer, Pokemon> getPokemonMap();
	List<Pokemon>getAllPokemonByTypre(String type);
	Pokemon getPokemonById(int id);
	List<String>getTipiPokemon();
	
	

}
