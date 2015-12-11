package fr.uvsq.coo.ex3_8.azerty;

public abstract class DAOAbstractFactory {

	public enum DAOType {
		JDBC, Serialisation
	};

	public abstract DAO<Personnel> getPersonnelDAO();

	public static DAOAbstractFactory getFactory(DAOType type) {
		if (type == DAOType.JDBC)
			return new DAOFactoryJDBC();
		if (type == DAOType.Serialisation)
			return new DAOFactorySerialisation();
		return null;
	}
}
