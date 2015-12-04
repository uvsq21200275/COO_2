package fr.uvsq.coo.ex3_9.azerty;

import java.util.Stack;

public class CalculatorCommand extends Command {

	protected Stack<String> s = new Stack<String>();

	public CalculatorCommand() {

	}

	public CalculatorCommand(Stack<String> h) {
		this.s = h;
	}

	@Override
	public void execute() {

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	protected Command clone() {
		// TODO Auto-generated method stub
		return new CalculatorCommand();
	}

}
