package fr.uvsq.coo.ex3_4.azerty;

import java.util.ArrayList;

/**
 * 
 * @author Thomas Estrabaud
 * 
 */

public class Manager extends Employe {

	private ArrayList<Employe> liste;

	Manager() {
		super();
		liste = new ArrayList<Employe>();
	}

	public void ajoutEmploye(Employe e) {
		this.liste.add(e);
	}

	public int calculSalaire() {

		int cpt = getSalaire() + 20 * calculSalaire();

		for (int i = 0; i < this.liste.size(); i++)
			cpt += 100;

		return cpt;
	}
}
