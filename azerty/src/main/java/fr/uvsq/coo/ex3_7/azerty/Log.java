package fr.uvsq.coo.ex3_7.azerty;

// Nécessite JDK 1.8

/**
 * 
 * @author Thomas Estrabaud
 * 
 */

public class Log {

	Log() {

	}

	public void debutLog(String str) {
		System.out.println(LocalDateTime.now() + "Début de la méthode" + str);
	}

	public void finLog(String str) {
		System.out.println(LocalDateTime.now() + "Fin de la méthode" + str);
	}

}
