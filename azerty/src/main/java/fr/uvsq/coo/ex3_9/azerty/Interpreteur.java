package fr.uvsq.coo.ex3_9.azerty;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class Interpreteur {

	protected Stack<String> history = new Stack<String>();
	protected Hashtable<String, Command> set = new Hashtable<String, Command>();
	protected CalculatorCommand CC = new CalculatorCommand();

	public void Session() {

		while (true) {
			Command command = getNewCommand();

			if (command instanceof Quit) {
				return;
			} else {
				command.execute();
			}
		}

	}

	public Command getNewCommand() {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		while (sc.nextLine().matches("\\d")) {
			CC.s.add(s);
			s = sc.nextLine();
		}

		while ((s = sc.nextLine()) != null) {
			if (set.containsKey(s))
				history.add(s);
			else
				System.err
						.println("Problème critique de l'error de la commande de la mort du tmtc zizi la famine");
		}

		sc.close();
		return ((Command) set.get(s)).clone();
	}
}
