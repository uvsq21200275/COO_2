package fr.uvsq.coo.ex3_8.azerty;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class PersonnelTest {

	/*
	 */
	@Test
	public void test() throws FileNotFoundException, IOException {

		Personnel P = new Personnel.PBuilder("toto", "tata").Build();
		File dataFile = new File("C:\\Users\\Thomas\\save.txt");

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			out.writeUTF(P.getNom());
			out.writeUTF(P.getPrenom());

		}
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(dataFile)))) {
			try {
				while (true) {
					String nom = in.readUTF();
					String prenom = in.readUTF();
					System.out.println("Nom : " + nom + " Prenom : " + prenom);
				}
			} catch (EOFException e) {
			}
		}
	}

}
