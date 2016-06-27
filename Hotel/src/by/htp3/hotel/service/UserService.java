package by.htp3.hotel.service;

import java.util.ArrayList;

import by.htp3.hotel.bean.User;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.exception.ServiceException;

public interface UserService {

	User authorisation(String login, String password) throws ServiceException;

	void addNewUser(String login, String password, String dublPassword, String name, String surname) throws ServiceException, DAOException;
	ArrayList<User> getAllUsers();
	
	void deleteUser(String name) throws DAOException;
}	
