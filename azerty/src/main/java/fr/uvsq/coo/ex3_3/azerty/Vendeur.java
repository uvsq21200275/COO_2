package fr.uvsq.coo.ex3_3.azerty;

public class Vendeur extends Employe {

	private int comission;

	Vendeur(int c) {
		super();
		this.comission = c;
	}

	@Override
	public int calculSalaire() {
		return this.getSalaire() + 20 * this.getAnnee() + this.comission;
	}

}
