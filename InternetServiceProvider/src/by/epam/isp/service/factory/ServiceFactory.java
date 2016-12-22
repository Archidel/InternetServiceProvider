package by.epam.isp.service.factory;

import by.epam.isp.service.AdminService;
import by.epam.isp.service.InitializationService;
import by.epam.isp.service.UserService;
import by.epam.isp.service.impl.AdminServiceImpl;
import by.epam.isp.service.impl.DAOServiceImpl;
import by.epam.isp.service.impl.UserServiceImpl;

public class ServiceFactory {
	public static ServiceFactory instance = null;
	private AdminService adminService = new AdminServiceImpl();
	private InitializationService daoService = new DAOServiceImpl();
	private UserService userService = new UserServiceImpl();
	
	private ServiceFactory() {}

	public static ServiceFactory getInstance() {
		if(instance == null){
			instance = new ServiceFactory();
		}
		return instance;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public InitializationService getDaoService() {
		return daoService;
	}

	public UserService getUserService() {
		return userService;
	}
	
}
