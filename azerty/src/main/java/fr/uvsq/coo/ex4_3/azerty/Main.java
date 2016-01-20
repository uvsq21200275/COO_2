package fr.uvsq.coo.ex4_3.azerty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	private static final String PERSISTENCE_UNIT_NAME = "todos";

	// private static EntityManagerFactory factory;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		if (em.isOpen())
			System.out.println("haha");

		em.getTransaction().begin();
		Personnel p = new Personnel();
		p.setNom("test");
		p.setPrenom("test2");
		p.setFonction("test3");
		p.setNaissance("naissance");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
}
