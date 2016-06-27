package by.htp3.hotel.service.impl;


import by.htp3.hotel.dao.DAOFactory;
import by.htp3.hotel.dao.RoomDAO;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.RoomService;
import by.htp3.hotel.service.exception.ServiceException;

public class RoomServiceImpl implements RoomService {

	@Override
	public void addNewRoom(String type, String price_a_day) throws ServiceException {
		if (type == null || type.isEmpty()) {
			throw new ServiceException("add new room exception");
		}

		if (price_a_day == null || price_a_day.isEmpty()) {
			throw new ServiceException("add new room exception");
		}

		DAOFactory daoFactory = DAOFactory.getInstance();
		RoomDAO dao = daoFactory.getRoomDAO();

		try {
			dao.addNewRoom(type, price_a_day);
		} catch (DAOException e) {
			throw new ServiceException("Error in source!", e);

		}

	}

}
