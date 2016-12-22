package by.epam.isp.service.impl;

import by.epam.isp.dao.InitializationDAO;
import by.epam.isp.dao.exception.DAOException;
import by.epam.isp.dao.factory.DAOFactory;
import by.epam.isp.service.InitializationService;
import by.epam.isp.service.exception.ServiceException;

public class DAOServiceImpl implements InitializationService {

	@Override
	public String InitizalizationDAO() throws ServiceException {
		String result = null;
		
		DAOFactory factory = DAOFactory.getInstance();
		InitializationDAO initializationDAO = factory.getInitializationDAO();
		
		try {
			result = initializationDAO.InitizalizationDAO();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return result;
	}

	@Override
	public String DestroyDAO() throws ServiceException {
		String result = null;
		
		DAOFactory factory = DAOFactory.getInstance();
		InitializationDAO initializationDAO = factory.getInitializationDAO();
		
		try {
			result = initializationDAO.DestroyDAO();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return result;
	}

}
