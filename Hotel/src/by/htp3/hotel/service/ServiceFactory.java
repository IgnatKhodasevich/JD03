package by.htp3.hotel.service;

import by.htp3.hotel.service.impl.RoomServiceImpl;
import by.htp3.hotel.service.impl.UserServiceImpl;

public class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();
	
	
	private UserService userService = new UserServiceImpl();
	private RoomService roomService = new RoomServiceImpl();
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	

	public UserService getUserService(){
		return userService;
	}
	
	public RoomService getRoomService(){
		return roomService;
	}
}
