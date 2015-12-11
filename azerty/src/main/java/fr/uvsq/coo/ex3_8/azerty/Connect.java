package fr.uvsq.coo.ex3_8.azerty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	String protocol = "jdbc:derby:test";
	public String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	Connection conn;

	// Noms tables : FIRSTTABLE, GENS
	// Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();

	// Properties connectionProps = new Properties();

	public Connect() {
		// connectionProps.put("user", userName);
		// connectionProps.put("password", password);
		try {
			DriverManager
					.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(protocol
				+ ";create=true")) {
			this.conn = conn;
			String createTable = "CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))";
			String createTable2 = "CREATE TABLE GENS (ID INT PRIMARY KEY, NAME VARCHAR(12), PRENOM VARCHAR(12), AGE INT)";
			String createTable3 = "CREATE TABLE Personnel(ID INT PRIMARY KEY, Nom VARCHAR(12), Prenom VARCHAR(12), Fonction VARCHAR(12), Naissance DATE)";
			System.out.println("Test2");
			// PreparedStatement update =
			// this.conn.prepareStatement(createTable3);
			// update.execute();
			// PreparedStatement update =
			// this.conn.prepareStatement(createTable2);
			// update.execute();

			System.out.println(this.conn.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
