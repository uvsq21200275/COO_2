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

public class PersonnelDAOSerial extends DAO<Personnel> {

	@Override
	public void create(Personnel obj) {

		File dataFile = new File("C:\\Users\\Thomas\\save.txt");

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			out.writeUTF(obj.getNom());
			out.writeUTF(obj.getPrenom());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Personnel find(String id) {

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
	public void update(Personnel obj) {

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
