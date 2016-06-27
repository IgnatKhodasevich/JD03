package by.htp3.hotel.command.impl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.bean.User;
import by.htp3.hotel.command.Command;
import by.htp3.hotel.command.util.QueryUtil;
import by.htp3.hotel.service.ServiceFactory;
import by.htp3.hotel.service.UserService;

public class GetAllUsers implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String query = QueryUtil.createHttpQueryString(request);
		request.getSession(true).setAttribute("prev_query", query);
		
		ArrayList <User> users = new ArrayList<User>();	
		UserService userService = ServiceFactory.getInstance().getUserService();
		users = userService.getAllUsers();
		request.setAttribute("all_users", users);
		
		request.getRequestDispatcher("WEB-INF/jsp/getAllUsers.jsp").forward(request, response);	
	}

}
