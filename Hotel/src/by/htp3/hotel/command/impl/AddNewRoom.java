package by.htp3.hotel.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.command.Command;
import by.htp3.hotel.service.RoomService;
import by.htp3.hotel.service.ServiceFactory;
import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRoomException;

public class AddNewRoom implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("ok0");
		
		int number = Integer.parseInt(request.getParameter("number"));
		String type = request.getParameter("type");
		int pricePerDay = Integer.parseInt(request.getParameter("price_per_day"));
		int floor = Integer.parseInt(request.getParameter("floor"));
		int numberOfPlaces = Integer.parseInt(request.getParameter("number_of_places"));
		
		String status = request.getParameter("status");
		
		

		try {
			System.out.println("ok1");
			RoomService roomService = ServiceFactory.getInstance().getRoomService();
			roomService.addNewRoom(number, type, pricePerDay, floor, numberOfPlaces, status);
			request.setAttribute("rooms", roomService);
			response.sendRedirect("http://localhost:8080/Hotel/Controller?command=show_free_rooms");
		} catch (ServiceException e) {
			e.printStackTrace();
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

	}

}
