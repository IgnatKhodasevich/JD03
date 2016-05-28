package by.htp3.lib.service.impl;

import by.htp3.lib.dao.CommonDao;
import by.htp3.lib.dao.DAOFactory;
import by.htp3.lib.service.ClientService;

public class ClientServiceImpl implements ClientService{

	@Override
	public boolean logination(String login, String password) {
		// parameters validation
		if (login == null || login.isEmpty()){
			return false;
		}
		
		
		DAOFactory factory = DAOFactory.getInstance();
		CommonDao commonDao = factory.getCommonDao();
		
		boolean result = commonDao.aothorization(login, password);
		
		return result;
	}

}
