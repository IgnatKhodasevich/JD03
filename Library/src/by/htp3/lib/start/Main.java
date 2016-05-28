package by.htp3.lib.start;

import by.htp3.lib.bean.Request;
import by.htp3.lib.bean.Response;
import by.htp3.lib.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		
		Request request = new Request();
		request.setCommandName("AUTHORIZATION_COMMAND");
		request.setLogin("mylogin");
		request.setPassword("mypassword");
		
		Response response = controller.doAction(request);
		
		if(response.getErrorMessage() != null){
			System.out.println(response.getMessage());
		}else{
			System.out.println(response.getErrorMessage());
		}
		
		

	}

}
