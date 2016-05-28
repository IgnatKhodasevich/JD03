package by.htp3.lib.dao;

import by.htp3.lib.dao.impl.SQLAdminDao;
import by.htp3.lib.dao.impl.SQLCommonDao;
import by.htp3.lib.dao.impl.SQLUserDao;

public class DAOFactory {
	private static final DAOFactory factory = new DAOFactory();
	
	private final CommonDao commonDao = new SQLCommonDao();
	private final UserDao userDao = new SQLUserDao();
	private final AdminDao adminDao = new SQLAdminDao();
	
	private DAOFactory(){}
	
	
	public static DAOFactory getInstance(){
		return factory;
	}
	

	public CommonDao getCommonDao() {
		return commonDao;

	}

	public UserDao getUserDao() {

		return userDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;

	}

}
