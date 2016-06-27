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

public class GetFreeRooms implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String query = QueryUtil.createHttpQueryString(request);
		request.getSession(true).setAttribute("prev_query", query);
		
		
		System.out.println(query);
		
		Room r1 = new Room(1, "*");
		Room r2 = new Room(2, "**");
		Room r3 = new Room(3, "****");
		Room r4 = new Room(4, "*");
		Room r5 = new Room(5, "*");
		
		
		List<Room> rooms = new ArrayList<>();
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);
		rooms.add(r5);

		request.setAttribute("free_rooms", rooms);
		
		request.getRequestDispatcher("WEB-INF/jsp/showFreeRooms.jsp").forward(request, response);
		
	}

}
