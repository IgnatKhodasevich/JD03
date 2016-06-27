package by.htp3.hotel.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp3.hotel.command.Command;

public class ChangeLanguage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		HttpSession session = request.getSession(true);

		session.setAttribute("locale", request.getParameter("language"));

		String prev_query = (String) request.getSession(false).getAttribute("prev_query");

		if (prev_query != null) {
			response.sendRedirect(prev_query);
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
