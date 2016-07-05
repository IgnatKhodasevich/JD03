package by.htp3.hotel.service.impl;


import java.util.ArrayList;

import by.htp3.hotel.bean.Room;
import by.htp3.hotel.dao.DAOFactory;
import by.htp3.hotel.dao.RoomDAO;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.RoomService;
import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRoomException;

public class RoomServiceImpl implements RoomService {

	@Override
	public void addNewRoom(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) throws ServiceException {
		
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		RoomDAO dao = daoFactory.getRoomDAO();

		try {
			dao.addNewRoom(number, type, pricePerDay, floor, numberOfPlaces, status);
		} catch (DAOException e) {
			throw new ServiceException("Error in source!", e);

		} catch (NumberFormatException e) {
			throw new ServiceRoomException("Wrong params!");
		}
			

	}





@Override
public ArrayList<Room> getAllRooms() {
	ArrayList<Room> rooms = new ArrayList<Room>();
	DAOFactory daoFactory = DAOFactory.getInstance();
	RoomDAO dao = daoFactory.getRoomDAO();
	try {
		rooms = dao.getAllRooms();
	
	}catch (DAOException e) {
			
			e.printStackTrace();
	}
	return rooms;
}
}