package by.htp3.hotel.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.command.Command;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.ServiceFactory;
import by.htp3.hotel.service.UserService;
import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRegisterException;

public class DeleteUser implements Command {
	private static final String NAME = "name";
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ServiceRegisterException, ServiceException {
		String name = request.getParameter(NAME);
		request.getSession(true).setAttribute("prev_page", "/WEB-INF/jsp/user.jsp");
		System.out.println(name);
		try {
			UserService userService = ServiceFactory.getInstance().getUserService();
			
			userService.deleteUser(name);
			
			
			request.setAttribute("progressMessage", "User was deleted");
			request.getRequestDispatcher("/WEB-INF/jsp/getAllUsers.jsp").forward(request, response);
			
		} catch (DAOException e) {
				
				e.printStackTrace();
			
		} 
	}

}
