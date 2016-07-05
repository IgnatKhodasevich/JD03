package by.htp3.hotel.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.bean.Room;
import by.htp3.hotel.command.Command;
import by.htp3.hotel.command.util.QueryUtil;
import by.htp3.hotel.service.RoomService;
import by.htp3.hotel.service.ServiceFactory;

public class GetAllRooms implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String query = QueryUtil.createHttpQueryString(request);
		request.getSession(true).setAttribute("prev_query", query);
		
		ArrayList<Room> rooms = new ArrayList<>();
		RoomService roomService  = ServiceFactory.getInstance().getRoomService();
		rooms = roomService.getAllRooms();
		
		request.setAttribute("all_rooms", rooms);
		
		request.getRequestDispatcher("WEB-INF/jsp/getAllRooms.jsp").forward(request, response);
		
	}

}
