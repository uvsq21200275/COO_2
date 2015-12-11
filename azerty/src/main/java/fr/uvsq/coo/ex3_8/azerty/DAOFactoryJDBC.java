package fr.uvsq.coo.ex3_8.azerty;

public class DAOFactoryJDBC extends DAOAbstractFactory {

	@Override
	public DAO<Personnel> getPersonnelDAO() {
		return new PersonnelDAO_JBDC();
	}

	@Override
	public DAO<Groupe> getGroupeDAO() {
		return new GroupeDAO_JBDC();
	}

}
