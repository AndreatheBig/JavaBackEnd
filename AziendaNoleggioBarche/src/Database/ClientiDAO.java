package Database;

import model.Clienti;

public interface ClientiDAO {

	String FIND_ALL="SELECT * FROM clienti";
	String ADD="INSERT INTO clienti (nome,cognome,eta,giorniNolo,id) values (?,?,?,?,?)";
	
	public void addClienti(Clienti cliente);
	
}
