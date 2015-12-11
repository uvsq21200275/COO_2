package fr.uvsq.coo.ex3_8.azerty;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonnelDAO_JBDC extends DAO<Personnel> {

	@Override
	public void create(Personnel obj) {

		try {
			PreparedStatement res = this.c.conn
					.prepareStatement("INSERT INTO Personnel VALUES(?,?,?,?)");
			res.setString(1, obj.getNom());
			res.setString(1, obj.getPrenom());
			res.setString(1, obj.getFonction());
			res.setString(1, obj.getNaissance());

			res.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Personnel find(String id) {

		try {
			PreparedStatement res = this.c.conn
					.prepareStatement("SELECT * FROM Personnel WHERE Nom = ?");
			res.setString(1, id);

			ResultSet rs = res.executeQuery();

			return new Personnel.PBuilder(rs.getString("Nom"),
					rs.getString("Prenom")).Fonction(rs.getString("Fonction"))
					.Naissance(rs.getString("Naissance")).Build();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void update(Personnel obj) {
		try {
			PreparedStatement res = this.c.conn
					.prepareStatement("INSERT INTO Personnel VALUES("
							+ obj.getNom() + obj.getPrenom()
							+ obj.getFonction() + obj.getNaissance());

			res.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Personnel obj) {

		try {
			PreparedStatement res = this.c.conn
					.prepareStatement("DELETE FROM Personnel WHERE Nom = ?");
			res.setString(1, obj.getNom());

			res.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
