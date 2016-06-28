package by.htp3.hotel.service.impl;


import by.htp3.hotel.dao.DAOFactory;
import by.htp3.hotel.dao.RoomDAO;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.RoomService;
import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRegisterException;
import by.htp3.hotel.service.exception.ServiceRoomException;

public class RoomServiceImpl implements RoomService {

	@Override
	public void addNewRoom(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) throws ServiceException {
		if (!ValidationInAddNewRoom.validate(number, type, pricePerDay, floor, numberOfPlaces, status)){
			throw new ServiceRoomException("Specify the correct data!");
		}

		
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


static class ValidationInAddNewRoom {
	  static boolean validate(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) throws ServiceRegisterException, ServiceRoomException {
	   
		  if (String.valueOf(number) == null ||String.valueOf(number).isEmpty()) {
		   throw new ServiceRoomException("Field \"number\" can not be empty!"
             + "Please, require number!");
	   }

	   if (type == null || type.isEmpty()) {
		    throw new ServiceRoomException("Field \"type\" can not be empty!");
	   }

	   if (String.valueOf(pricePerDay) == null ||String.valueOf(pricePerDay).isEmpty()) {
		   throw new ServiceRoomException("Field \"price\" can not be empty!"
             + "Please, require price!");
	   }
	   if (String.valueOf(floor) == null ||String.valueOf(floor).isEmpty()) {
		   throw new ServiceRoomException("Field \"floor\" can not be empty!"
             + "Please, require floor!");
	   }
	   if (String.valueOf(numberOfPlaces) == null ||String.valueOf(numberOfPlaces).isEmpty()) {
		   throw new ServiceRoomException("Field \"number of places\" can not be empty!"
             + "Please, require number of places!");
	   }
	   if (status == null || status.isEmpty()) {
		    throw new ServiceRoomException("Field \"status\" can not be empty!");
	   }
	  

	   return true;
	  }
	 }
}