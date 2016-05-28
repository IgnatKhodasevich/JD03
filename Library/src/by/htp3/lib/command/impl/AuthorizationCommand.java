package by.htp3.lib.command.impl;

import by.htp3.lib.bean.Request;
import by.htp3.lib.bean.Response;
import by.htp3.lib.command.Command;
import by.htp3.lib.service.ClientService;
import by.htp3.lib.service.ServiceFactory;

public class AuthorizationCommand implements Command{

	@Override
	public Response execute(Request request) {

		String login = request.getLogin();
		String password = request.getPassword();
		
		ServiceFactory factory = ServiceFactory.getInstance();
		ClientService service = factory.getClientService();
		
		boolean result = service.logination(login, password);
		
		Response response = new Response();
		response.setErrorMessage(null);
		response.setMessage("Logination is OK");
		
		return response;
	}

}
