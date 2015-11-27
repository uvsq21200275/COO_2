package fr.uvsq.coo.ex3_8.azerty;

import java.util.ArrayList;

public class Groupe implements Element {

	private String Nom;
	private ArrayList<Element> list = new ArrayList<Element>();

	public void Affichage() {
		System.out.println("------------------------------");
		System.out.println(this.Nom);
		System.out.println("------------------------------");
		for (int i = 0; i < this.list.size(); i++)
			list.get(i).Affichage();
	}

}
