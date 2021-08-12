package aplicacao;

import java.sql.Connection;

import db.DB;

public class App {
	
	public static void main(String[] args) {
		
		Connection conn = (Connection) DB.getConnection();
		DB.closeConnection();
		
	}

}
