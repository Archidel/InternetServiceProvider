package by.epam.isp.service;

import by.epam.isp.service.exception.ServiceException;

public interface InitializationService {
	String InitizalizationDAO() throws ServiceException;
	String DestroyDAO() throws ServiceException;
}
