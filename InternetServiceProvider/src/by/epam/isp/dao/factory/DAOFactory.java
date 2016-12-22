package by.epam.isp.dao.factory;

import by.epam.isp.dao.AdminDAO;
import by.epam.isp.dao.InitializationDAO;
import by.epam.isp.dao.UserDAO;
import by.epam.isp.dao.impl.AdminDAOImpl;
import by.epam.isp.dao.impl.InitializationDAOImpl;
import by.epam.isp.dao.impl.UserDAOImpl;

public class DAOFactory {
	public static DAOFactory instance = null;
	private AdminDAO adminDAO = new AdminDAOImpl();
	private UserDAO userDAO = new UserDAOImpl();
	private InitializationDAO initializationDAO = new InitializationDAOImpl();
	
	private DAOFactory() {}

	public static DAOFactory getInstance() {
		return instance;
	}

	public AdminDAO getAdminDAO() {
		return adminDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public InitializationDAO getInitializationDAO() {
		return initializationDAO;
	}

	
}
