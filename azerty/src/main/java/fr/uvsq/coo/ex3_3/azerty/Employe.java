package fr.uvsq.coo.ex3_3.azerty;

public class Employe {

	private int salaire;
	private int annee;

	Employe() {

		this.salaire = 1500;
		annee = 0;
	}

	Employe(int s) {
		this.salaire = s;
		annee = 0;
	}

	public int calculSalaire() {
		return this.salaire + 20 * this.annee;
	}

	public int getSalaire() {
		return salaire;
	}

	public int getAnnee() {
		return annee;
	}

	public void incrementeAnnee() {
		this.annee += 1;
	}

}
