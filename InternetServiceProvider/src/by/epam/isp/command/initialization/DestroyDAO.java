package by.epam.isp.command.initialization;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.isp.command.Command;
import by.epam.isp.command.exception.CommandException;
import by.epam.isp.service.InitializationService;
import by.epam.isp.service.exception.ServiceException;
import by.epam.isp.service.factory.ServiceFactory;

public class DestroyDAO implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		String result = null;
		
		ServiceFactory factory = ServiceFactory.getInstance();
		InitializationService initializationService = factory.getDaoService();
		
		try {
			result = initializationService.DestroyDAO();
		} catch (ServiceException e) {
			throw new CommandException(e);
		}		
		return result;
	}

}
