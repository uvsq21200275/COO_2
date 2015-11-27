package fr.uvsq.coo.ex3_8.azerty;

import java.util.ArrayList;

public final class Personnel implements Element {

	private final String Nom, Prenom, Fonction, Naissance;
	private final ArrayList<String> list;

	private Personnel(PBuilder Builder) {
		this.Nom = Builder.Nom;
		this.Prenom = Builder.Prenom;
		this.Fonction = Builder.Fonction;
		this.Naissance = Builder.Naissance;
		this.list = Builder.list;
	}

	public void Affichage() {
		System.out.println(Nom + " " + Prenom + " " + Fonction + " "
				+ Naissance);
	}

	public static class PBuilder {

		private final String Nom, Prenom;

		private String Fonction = "";
		private String Naissance = "";
		private ArrayList<String> list = new ArrayList<String>();

		public Personnel Build() {
			return new Personnel(this);
		}

		public PBuilder(String nom, String prenom) {
			this.Nom = nom;
			this.Prenom = prenom;
		}

		public PBuilder Fonction(String Fonction) {
			this.Fonction = Fonction;
			return this;
		}

		public PBuilder Naissance(String Naissance) {
			this.Naissance = Naissance;
			return this;
		}

		public PBuilder list(ArrayList<String> liste) {
			for (int i = 0; i < liste.size(); i++) {
				this.list.add(liste.get(i));
			}
			return this;
		}

	}

}
