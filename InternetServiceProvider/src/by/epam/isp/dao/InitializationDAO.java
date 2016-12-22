package by.epam.isp.dao;

import by.epam.isp.dao.exception.DAOException;

public interface InitializationDAO {
	String InitizalizationDAO() throws DAOException;
	String DestroyDAO() throws DAOException;
}
