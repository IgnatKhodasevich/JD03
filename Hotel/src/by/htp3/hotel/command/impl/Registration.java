package by.htp3.hotel.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.bean.User;
import by.htp3.hotel.command.Command;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.ServiceFactory;
import by.htp3.hotel.service.UserService;
import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRegisterException;

public class Registration implements Command {
	
	private static final String LOGIN_REGISTRATION = "login";
	private static final String PASSWORD_REGISTRATION = "password";
	private static final String DUBLICATE_PASSWORD_REGISTRATION = "dublPassword";
	private static final String NAME_REGISTRATION = "name";
	private static final String SURNAME_REGISTRATION = "surname";
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String login = request.getParameter(LOGIN_REGISTRATION);
		String password = request.getParameter(PASSWORD_REGISTRATION);
		String dublPassword = request.getParameter(DUBLICATE_PASSWORD_REGISTRATION);
		String name = request.getParameter(NAME_REGISTRATION);
		String surname = request.getParameter(SURNAME_REGISTRATION);
		request.getSession(true).setAttribute("prev_page", "/WEB-INF/jsp/addNewUser.jsp");
		try {
			UserService userService = ServiceFactory.getInstance().getUserService();
		
			userService.addNewUser(login, password, dublPassword, name, surname);
			request.setAttribute("user", new User(name, surname, login, password));
			
			request.getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(request, response);
			
		} catch (DAOException e) {
				
				e.printStackTrace();
			
		} catch (ServiceRegisterException e) {
			   request.setAttribute("errorMessage", e.getMessage());
			   request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		
		} catch (ServiceException e) {
			
			e.printStackTrace();
		} 

}
}
