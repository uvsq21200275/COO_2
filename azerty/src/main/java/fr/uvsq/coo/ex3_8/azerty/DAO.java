package fr.uvsq.coo.ex3_8.azerty;

public interface DAO<T> {

	/*
	 * Class.forName("com.mysql.jdbc.Driver"); String dburl =
	 * "jdbc:mysql://localhost/test";
	 *//*
		 * Properties connection Props = new Properties();
		 * connectionProps.put("user", userName); connectionProps.put("password"
		 * , password); try(Connection conn = DriverManager.getConnection(
		 * "jdbc:mysql://localhost/test", connectionProps)){
		 * 
		 * }
		 */

	// protected Connection connect = ; CREER UNE CLASSE CONNECT

	public abstract T create(T obj);

	public abstract T find(String id);

	public abstract T update(T obj);

	public abstract void delete(T obj);
}
