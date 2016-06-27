package by.htp3.hotel.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.command.Command;
import by.htp3.hotel.service.RoomService;
import by.htp3.hotel.service.ServiceFactory;
import by.htp3.hotel.service.exception.ServiceException;

public class AddNewRoom implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String type = request.getParameter("type");
		String priceADay = request.getParameter("price_a_day");

		try {
			RoomService roomService = ServiceFactory.getInstance().getRoomService();
			roomService.addNewRoom(type, priceADay);

			response.sendRedirect("http://localhost:8080/Hotel/Controller?command=show_free_rooms");
		} catch (ServiceException e) {
			e.printStackTrace();
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

	}

}
