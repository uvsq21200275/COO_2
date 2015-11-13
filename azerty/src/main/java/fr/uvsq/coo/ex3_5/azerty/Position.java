package fr.uvsq.coo.ex3_5.azerty;

/**
 * 
 * @author Thomas Estrabaud
 * 
 */

public class Position {

	public int i, j;

	Position(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void deplace(int i, int j) {
		this.i += i;
		this.j += j;
	}

}
