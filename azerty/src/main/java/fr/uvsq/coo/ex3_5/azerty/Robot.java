package fr.uvsq.coo.ex3_5.azerty;

import java.util.ArrayList;

public class Robot {

	static ArrayList<Robot> list = new ArrayList<Robot>();

	private Position position;
	private Direction direction;

	Robot(Position p, Direction d) {
		this.position = p;
		this.direction = d;
		list.add(this);
	}

	public void tourne() {
		direction.tourne(1);
	}

	public void avance(int i, int j) {
		position.deplace(i, j);
	}

	public static void avancerTous(int i, int j) {

		for (int k = 0; k < list.size(); k++)
			list.get(k).avance(i, j);

	}
}
