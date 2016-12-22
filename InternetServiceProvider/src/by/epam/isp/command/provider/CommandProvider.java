package by.epam.isp.command.provider;

import java.util.HashMap;
import java.util.Map;

import by.epam.isp.command.Command;
import by.epam.isp.command.NameCommand;
import by.epam.isp.command.authorization.SingIn;
import by.epam.isp.command.authorization.SingOut;
import by.epam.isp.command.exception.CommandNotFoundException;
import by.epam.isp.command.initialization.DestroyDAO;
import by.epam.isp.command.initialization.InitializationDAO;
import by.epam.isp.command.localization.Localization;

public class CommandProvider {
	public static CommandProvider instance = null;
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	private CommandProvider() {
		commands.put(NameCommand.INITIALIZATION_DAO_CMD, new InitializationDAO());
		commands.put(NameCommand.DESTROY_DAO_CMD, new DestroyDAO());		
		commands.put(NameCommand.LOCALIZATION_CMD, new Localization());
		commands.put(NameCommand.SING_IN_CMD, new SingIn());
		commands.put(NameCommand.SING_OUT_CMD, new SingOut());
	}

	public static CommandProvider getInstance() {
		if(instance == null){
			instance = new CommandProvider();
		}
		return instance;
	}

	public Command getCommand(String nameCommand) throws CommandNotFoundException{
		Command command = null;
		command = commands.get(nameCommand);
		if(command == null){
			throw new CommandNotFoundException();
		}
		return command;
	}
	
	
}
