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
	public void addNewRoom(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) throws DAOException {
		Connection con = null;
		PreparedStatement st = null;
		

		try {
			con = ConnectionPool.getInstance().takeConnection();

			st = con.prepareStatement("INSERT INTO rooms (number, type, price_per_day, floor, numberOfPlaces, status) VALUES (?,?,?,?,?,?)");
			
			st.setInt(1, number);
			st.setString(2, type);
			st.setInt(3, pricePerDay);
			st.setInt(4, floor);
			st.setInt(5, numberOfPlaces);
			st.setString(6, status);
			
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
			
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
