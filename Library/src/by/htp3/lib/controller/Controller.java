package by.htp3.lib.controller;

import by.htp3.lib.bean.Request;
import by.htp3.lib.bean.Response;
import by.htp3.lib.command.Command;

public class Controller {
	private final CommandHelper helper = new CommandHelper();
	
	public Controller(){}
	
	
	public Response doAction(Request request){
		
		String commandName = request.getCommandName();
		Command command = helper.getCommand(commandName);
		Response response = command.execute(request);
		return response;
		
	}

}
