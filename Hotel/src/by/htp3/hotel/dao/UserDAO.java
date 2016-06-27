package by.htp3.hotel.dao;


import java.util.ArrayList;

import by.htp3.hotel.bean.User;
import by.htp3.hotel.dao.exception.DAOException;

public interface UserDAO {
	User authorisation(String login, String password) throws DAOException;
	void addNewUser(String login, String password, String name, String surname) throws DAOException;
	ArrayList <User> getAllUsers() throws DAOException;
	void deleteUser (String name) throws DAOException;
}
