package fr.uvsq.coo.ex3_9.azerty;

import java.util.Stack;

public class Plus extends CalculatorCommand {

	public Plus(Stack<String> h) {
		super(h);
		// TODO Auto-generated constructor stub
	}

	public void execute() {

		this.s.add(""
				+ (Integer.parseInt(this.s.pop()) + Integer.parseInt(this.s
						.pop())));
	}
}
