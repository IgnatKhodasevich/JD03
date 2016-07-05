package by.htp3.hotel.dao;

import java.util.ArrayList;

import by.htp3.hotel.bean.Room;
import by.htp3.hotel.dao.exception.DAOException;

public interface RoomDAO {
	void addNewRoom(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) throws DAOException;
	ArrayList <Room> getAllRooms() throws DAOException;
}
