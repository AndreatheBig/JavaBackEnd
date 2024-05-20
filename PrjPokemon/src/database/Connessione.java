package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL="jdbc:mysql://localhost:3306/javabe24";
	private final String USER="app_goal";
	private final String PASSWORD="root";
	
	private Connection conn = null;
	
	public Connection getConn() {
		
		if (conn==null)
			connetti();
		return conn;
	}
	
	private void connetti() {
		
		try {
			this.conn=DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("sei connesso");
		} catch (SQLException e) {
			System.err.printf("si è verificato un eccezzione sql %s",
					e.getMessage());
		}
	}
	

}
