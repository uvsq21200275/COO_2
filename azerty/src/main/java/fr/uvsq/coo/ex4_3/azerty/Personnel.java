package fr.uvsq.coo.ex4_3.azerty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public final class Personnel implements Element {

	@Id
	private String Nom;
	@Column
	private String Prenom;
	@Column
	private String Fonction;
	@Column
	private String Naissance;

	public Personnel() {
		this.Nom = "";
		this.Prenom = "";
		this.Fonction = "";
		this.Naissance = "";
	}

	public Personnel(String Nom, String Prenom, String Fonction,
			String Naissance) {
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Fonction = Fonction;
		this.Naissance = Naissance;
	}

	public String getNom() {
		return this.Nom;
	}

	public String getPrenom() {
		return this.Prenom;
	}

	public String getFonction() {
		return Fonction;
	}

	public String getNaissance() {
		return Naissance;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public void setFonction(String fonction) {
		Fonction = fonction;
	}

	public void setNaissance(String naissance) {
		Naissance = naissance;
	}

	public void Affichage() {
		System.out.println(Nom + " " + Prenom + " " + Fonction + " "
				+ Naissance);
	}
}
