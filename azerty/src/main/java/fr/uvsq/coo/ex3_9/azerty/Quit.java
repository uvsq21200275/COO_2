package fr.uvsq.coo.ex3_9.azerty;

public class Quit extends Command {

	public void Quit() {

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	protected Command clone() {
		// TODO Auto-generated method stub
		return new Quit();
	}

}
