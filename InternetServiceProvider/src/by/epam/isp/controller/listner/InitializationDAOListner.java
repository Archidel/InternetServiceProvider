package by.epam.isp.controller.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import by.epam.isp.command.Command;
import by.epam.isp.command.NameCommand;
import by.epam.isp.command.exception.CommandException;
import by.epam.isp.command.exception.CommandNotFoundException;
import by.epam.isp.command.provider.CommandProvider;

public class InitializationDAOListner implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		CommandProvider provider = CommandProvider.getInstance();
		Command command = null;
		try {
			command = provider.getCommand(NameCommand.DESTROY_DAO_CMD);
			command.execute(null, null);
		} catch (CommandNotFoundException | CommandException e) {
			e.printStackTrace();
			//LOGGER
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		CommandProvider provider = CommandProvider.getInstance();
		Command command = null;
		try {
			command = provider.getCommand(NameCommand.INITIALIZATION_DAO_CMD);
			command.execute(null, null);
		} catch (CommandNotFoundException | CommandException e) {
			e.printStackTrace();
			//LOGGER
		}
	}
	
}
