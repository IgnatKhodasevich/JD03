package by.htp3.hotel.dao;

import by.htp3.hotel.dao.exception.DAOException;

public interface RoomDAO {
	void addNewRoom(String type, String price_a_day) throws DAOException;
	
}
