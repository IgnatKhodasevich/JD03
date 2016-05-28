package by.htp3.lib.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp3.lib.command.Command;
import by.htp3.lib.command.impl.AddBookCommand;
import by.htp3.lib.command.impl.AuthorizationCommand;
import by.htp3.lib.command.impl.GetCalatog;
import by.htp3.lib.command.impl.RegisterUser;

public class CommandHelper {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandHelper(){
		commands.put(CommandName.AUTHORIZATION_COMMAND, new AuthorizationCommand());
		commands.put(CommandName.ADD_BOOK_COMMAND, new AddBookCommand());
		commands.put(CommandName.REGISTER_USER, new RegisterUser());
		commands.put(CommandName.GET_CATALOG, new GetCalatog());
	}
	
	public Command getCommand(String commandName){//"REGISTER_USER"
		CommandName command = CommandName.valueOf(commandName);
		Command executeCommand = commands.get(command);
		return executeCommand;
	}
	

}
