package by.htp3.hotel.service;

import by.htp3.hotel.service.exception.ServiceException;

public interface RoomService {
	
	void addNewRoom(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status)  throws ServiceException;

}
