package by.epam.isp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.isp.command.Command;
import by.epam.isp.command.exception.CommandException;
import by.epam.isp.command.exception.CommandNotFoundException;
import by.epam.isp.command.provider.CommandProvider;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response){
//		String responseMessage = null;
		
		CommandProvider provider = CommandProvider.getInstance();
		Command command;
		try {
			command = provider.getCommand(null);
			command.execute(request, response);
		} catch (CommandNotFoundException e) {
			e.printStackTrace();
			//LOGGER
		} catch (CommandException e) {
			e.printStackTrace();
			//LOGGER
		}
		
		
		
		//responseMessage ????
	}
	
}
