package fr.uvsq.coo.ex3_9.azerty;

import java.util.Stack;

public class Mul extends CalculatorCommand {

	public Mul(Stack<String> h) {
		super(h);
		// TODO Auto-generated constructor stub
	}

	public void execute() {

		this.s.add(""
				+ (Integer.parseInt(this.s.pop()) * Integer.parseInt(this.s
						.pop())));
	}
}
