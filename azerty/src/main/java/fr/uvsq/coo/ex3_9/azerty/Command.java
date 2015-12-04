package fr.uvsq.coo.ex3_9.azerty;

public abstract class Command implements Cloneable {
	public abstract void execute();

	public abstract void undo();

	protected abstract Command clone();
}
