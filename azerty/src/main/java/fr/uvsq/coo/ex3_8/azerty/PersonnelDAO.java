package fr.uvsq.coo.ex3_8.azerty;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonnelDAO implements DAO<Personnel> {

	@Override
	public Personnel create(Personnel obj) {
		/*
		 * try { PreparedStatement prepare = connect
		 * .prepareStatement("INSERT INTO personnel(nom,prenom) VALUES(?,?)");
		 * prepare.setString(1, obj.getNom()); prepare.setString(2,
		 * obj.getPrenom()); int result = prepare.executeUpdate(); assert result
		 * == 1; } catch (SQLException e) { e.printStackTrace(); } return obj;
		 */

		File dataFile = new File("C:\\Users\\Thomas\\save.txt");

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			out.writeUTF(obj.getNom());
			out.writeUTF(obj.getPrenom());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;

	}

	@Override
	public Personnel find(String id) {
		/*
		 * Personnel P = new Personnel.PBuilder("", "").Build(); try {
		 * PreparedStatement prepare = connect
		 * .prepareStatement("SELECT * FROM personnel WHERE nom = ?");
		 * prepare.setString(1, id); ResultSet result = prepare.executeQuery();
		 * if (result.first()) { P = new
		 * Personnel.PBuilder(result.getString("nom"),
		 * result.getString("prenom")).Build(); } } catch (SQLException e) {
		 * e.printStackTrace(); }
		 * 
		 * return P;
		 */

		File dataFile = new File("C:\\Users\\Thomas\\save.txt");

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(dataFile)))) {
			try {
				while (true) {
					String nom = in.readUTF();
					String prenom = in.readUTF();
					if (nom.equals(id))
						return new Personnel.PBuilder(nom, prenom).Build();
				}
			} catch (EOFException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return new Personnel.PBuilder("", "").Build();
	}

	@Override
	public Personnel update(Personnel obj) {

		File dataFile = new File("C:\\Users\\Thomas\\save.txt");
		ArrayList<Personnel> list = new ArrayList<Personnel>();

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(dataFile)))) {
			try {
				while (true) {
					String nom = in.readUTF();
					String prenom = in.readUTF();
					if (!nom.equals(obj.getNom()))
						list.add(new Personnel.PBuilder(nom, prenom).Build());

				}
			} catch (EOFException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		list.add(obj);

		for (Personnel p : list) {
			create(p);
		}
		return new Personnel.PBuilder("", "").Build();
	}

	@Override
	public void delete(Personnel obj) {

		File dataFile = new File("C:\\Users\\Thomas\\save.txt");
		ArrayList<Personnel> list = new ArrayList<Personnel>();

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(dataFile)))) {
			try {
				while (true) {
					String nom = in.readUTF();
					String prenom = in.readUTF();
					if (!nom.equals(obj.getNom()))
						list.add(new Personnel.PBuilder(nom, prenom).Build());

				}
			} catch (EOFException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (Personnel p : list) {
			create(p);
		}
	}

}
