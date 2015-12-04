package fr.uvsq.coo.ex3_9.azerty;

public class Calculator extends Interpreteur {

	public Calculator() {
		set.put("quit", new Quit());
		set.put("undo", new Undo(history));
		set.put("+", new Plus(history));
		set.put("-", new Min(history));
		set.put("*", new Mul(history));
		set.put("/", new Div(history));
		set.put("accept", new Accept(history));
	}
}
