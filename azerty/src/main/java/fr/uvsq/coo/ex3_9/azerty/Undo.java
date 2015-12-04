package fr.uvsq.coo.ex3_9.azerty;

import java.util.Stack;

public class Undo extends Command {

	protected Stack<String> history = new Stack<String>();

	public Undo(Stack<String> h) {
		this.history = h;

	}

	public void execute() {
		((Command) (Object) (history.pop())).undo();
		// Si ça se trouve c'est un peu le cancer
	}

	public void undo() {
	}

	@Override
	protected Command clone() {
		return new Undo(this.history);

	}

}
