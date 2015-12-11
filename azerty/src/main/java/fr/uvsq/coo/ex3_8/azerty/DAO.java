package fr.uvsq.coo.ex3_8.azerty;

public abstract class DAO<T> {

	Connect c = new Connect();

	public abstract void create(T obj);

	public abstract T find(String id);

	public abstract void update(T obj);

	public abstract void delete(T obj);
}
