package by.htp3.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import by.htp3.hotel.dao.RoomDAO;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.dao.impl.pool.ConnectionPool;
import by.htp3.hotel.dao.impl.pool.ConnectionPoolException;

public class SQLRoomDAO implements RoomDAO {

	@Override
	public void addNewRoom(String type, String price_a_day) throws DAOException {
		Connection con = null;
		PreparedStatement st = null;
		

		try {
			con = ConnectionPool.getInstance().takeConnection();

			st = con.prepareStatement("INSERT INTO rooms (type, price_a_day) VALUES (?,?)");

			st.setString(1, type);
			st.setString(2, price_a_day);
			
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			st.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Logination sql error..", e);
		} catch (ConnectionPoolException e) {
			throw new DAOException("pool exception", e);
		} finally {

			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// logging
				}
			}
			try {
				ConnectionPool.getInstance().returnConnection(con);
			} catch (ConnectionPoolException e) {
				// loggin error
			}

		}
	}

}
