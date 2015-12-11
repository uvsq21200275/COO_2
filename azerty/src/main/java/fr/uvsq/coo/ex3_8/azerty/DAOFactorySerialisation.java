package fr.uvsq.coo.ex3_8.azerty;

public class DAOFactorySerialisation extends DAOAbstractFactory {

	public DAO<Personnel> getPersonnelDAO() {
		return new PersonnelDAOSerial();
	}

	public DAO<Groupe> getGroupeDAO() {
		return new GroupeDAOSerial();
	}

}
