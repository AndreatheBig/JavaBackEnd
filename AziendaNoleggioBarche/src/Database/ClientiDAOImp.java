package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Clienti;
import model.ConnessioneBarche;

public class ClientiDAOImp implements ClientiDAO {
	
	private ConnessioneBarche miaConn;
	private PreparedStatement ps;//contenitore per azioni
	private ResultSet rs;//contenitore risultati
	
	public ClientiDAOImp() {
		miaConn=new ConnessioneBarche();
	}

	@Override
	public void addClienti(Clienti cliente) {
		try {
			ps=miaConn.getCnn().prepareStatement(ADD);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCognome());
			ps.setInt(3, cliente.getEta());
			ps.setInt(4, cliente.getGiorniNolo());
			ps.setInt(5, cliente.getId());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
