package by.htp3.hotel.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import by.htp3.hotel.dao.impl.pool.ConnectionPool;
import by.htp3.hotel.dao.impl.pool.ConnectionPoolException;

public class HotelContextCreateListener implements ServletContextListener {

	private ConnectionPool pool;
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		pool.destroyPool();	
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		try {
			pool = ConnectionPool.getInstance();
			pool.init2();
			
		} catch (ConnectionPoolException e) {
			throw new RuntimeException("JDBC Driver error", e);
		}

	
	}

}
