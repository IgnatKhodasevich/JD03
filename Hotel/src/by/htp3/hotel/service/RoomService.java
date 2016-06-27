package by.htp3.hotel.service;

import by.htp3.hotel.service.exception.ServiceException;

public interface RoomService {
	
	void addNewRoom(String type, String price_a_day)  throws ServiceException;

}
