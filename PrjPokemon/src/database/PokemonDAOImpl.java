package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Pokemon;

public class PokemonDAOImpl implements PokemonDAO{
	
	private Connessione miaConn= new Connessione();
	private Statement istruzionePerDB;
	private ResultSet risultatiDB;
	
	private Map<Integer, Pokemon> Mappa= new HashMap<>();
	
	public PokemonDAOImpl() {
		getPokemonMap();
	} 
	
	@Override
	public List<Pokemon> getAllPokemon() {
		// TODO Auto-generated method stub
		return new ArrayList<Pokemon>(Mappa.values());
	}

	@Override
	public Map<Integer, Pokemon> getPokemonMap() {
		try {
			this.istruzionePerDB=miaConn.getConn().createStatement();
			this.risultatiDB=this.istruzionePerDB.executeQuery(FINDALL);
			
			while (risultatiDB.next()) {
				int id = risultatiDB.getInt(1);
				String nome = risultatiDB.getString(2);
				String type1 = risultatiDB.getString(3);
				String type2 = risultatiDB.getString(4);
				Pokemon p = new Pokemon(id,nome,type1,type2);
				Mappa.put(id,p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return Mappa;
	}

	@Override
	public List<Pokemon> getAllPokemonByTypre(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon getPokemonById(int id) {
		// TODO Auto-generated method stub
		return Mappa.get(id);
	}

	@Override
	public List<String> getTipiPokemon() {
		Set<String>tipi=new TreeSet<String>();
		
		for (Pokemon p : getAllPokemon()) {
			tipi.add( p.getTipo1());//tutti hanno il tipo 1
			if(!p.getTipo2().isEmpty()) {
				tipi.add(p.getTipo2());
			}
		}
		
		return new ArrayList<String>(tipi);
	}

}
