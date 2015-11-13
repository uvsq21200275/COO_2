package fr.uvsq.coo.ex3_5.azerty;

public class Direction {

	public int dir;

	/*
	 * 0 en haut 1 à droite 2 en bas 3 à gauche
	 */

	Direction(int dir) {
		this.dir = dir;
	}

	public void tourne(int nbTours) {

		for (int i = 0; i < nbTours; i++) {
			dir += 1;
			dir %= 4;
		}
	}
}
