package by.htp3.hotel.dao;

import by.htp3.hotel.dao.exception.DAOException;

public interface RoomDAO {
	void addNewRoom(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) throws DAOException;
	
}
