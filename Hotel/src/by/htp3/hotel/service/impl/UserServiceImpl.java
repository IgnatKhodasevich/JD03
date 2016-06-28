package by.htp3.hotel.service.impl;

import java.util.ArrayList;
import by.htp3.hotel.bean.User;
import by.htp3.hotel.dao.DAOFactory;
import by.htp3.hotel.dao.UserDAO;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.service.UserService;
import by.htp3.hotel.service.exception.ServiceAuthException;
import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRegisterException;

public class UserServiceImpl implements UserService {

 @Override
 public User authorisation(String login, String password) throws ServiceException, ServiceAuthException {

  if (!Validation.validate(login, password)) {
   throw new ServiceException("Wrong params");
  }
  
  DAOFactory daoFactory = DAOFactory.getInstance();
  UserDAO dao = daoFactory.getUserDAO();

  User user;
  try {

   user = dao.authorisation(login, password);
    
   if (user == null) {
    throw new ServiceAuthException("Wrong login or password");
   }

  } catch (DAOException e) {
   throw new ServiceException("Error in source", e);
  }

  return user;
 }

 static class Validation {
  static boolean validate(String login, String password) {
   if (login == null || login.isEmpty()) {
    return false;
   }

   if (password == null || password.isEmpty()) {
    return false;
   }

   return true; 
  }
 }


@Override
public void addNewUser(String login, String password, String dublPassword, String name, String surname) throws ServiceException, DAOException {
	if (!ValidationInRegistration.validate(login, password, dublPassword, name, surname)) {
		   throw new ServiceRegisterException("Please, complete all fields");
		  }
	DAOFactory daoFactory = DAOFactory.getInstance();
	UserDAO dao = daoFactory.getUserDAO();
	
		dao.addNewUser(login, password, name, surname);
	
}
static class ValidationInRegistration {
	  static boolean validate(String login, String password, String dublPassword, String name, String surname) throws ServiceRegisterException {
	   if (login == null || login.isEmpty()) {
		   throw new ServiceRegisterException("Field \"login\" can not be empty!"
               + "Please, require login!");
	   }

	   if (password == null || password.isEmpty()) {
		    throw new ServiceRegisterException("Field \"password\" can not be empty!");
	   }

	   if (dublPassword == null || dublPassword.isEmpty()){
		   throw new ServiceRegisterException("Please, confirm password");
	   }
	   if (name == null || name.isEmpty()){
		   throw new ServiceRegisterException("Please, require your name!");
	   }
	   if (surname == null || surname.isEmpty()){
		   throw new ServiceRegisterException("Please, require your surname!");
	   }
	  
	   if (password.equals(dublPassword) ){
		   return true;
	   }else{
		   throw new ServiceRegisterException("Please, confirm password");
	   }

	   
	  }
	 }


@Override
public ArrayList<User> getAllUsers() {
	ArrayList<User> users = new ArrayList<User>();
	DAOFactory daoFactory = DAOFactory.getInstance();
	UserDAO dao = daoFactory.getUserDAO();
	try {
		users = dao.getAllUsers();
	} catch (DAOException e) {
		
		e.printStackTrace();
	}
	return users;
}


@Override
public void deleteUser(String name) throws DAOException {
	  DAOFactory daoFactory = DAOFactory.getInstance();
	  UserDAO dao = daoFactory.getUserDAO();
	  dao.deleteUser(name);
	
}






}