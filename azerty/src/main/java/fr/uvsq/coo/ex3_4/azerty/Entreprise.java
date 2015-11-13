package fr.uvsq.coo.ex3_4.azerty;

/**
 * 
 * @author Thomas Estrabaud
 * 
 */

import java.util.ArrayList;

public class Entreprise {

	private ArrayList<Employe> liste;

	Entreprise() {
		this.liste = new ArrayList<Employe>();
	}

	public void ajoutEmploye(Employe e) {
		this.liste.add(e);
	}

	public int calculSalaire() {

		int cpt = 0;

		for (int i = 0; i < this.liste.size(); i++)
			cpt += this.liste.get(i).calculSalaire();

		return cpt;
	}

}
