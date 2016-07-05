package by.htp3.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import by.htp3.hotel.bean.User;
import by.htp3.hotel.dao.UserDAO;
import by.htp3.hotel.dao.exception.DAOException;
import by.htp3.hotel.dao.impl.pool.ConnectionPool;
import by.htp3.hotel.dao.impl.pool.ConnectionPoolException;

public class SQLUserDAO implements UserDAO {

	// private static final String AUTH_QUERY = "select * from user where
	// login=\""+login+"\" and password=\""+password+"\"";

	@Override
	public User authorisation(String login, String password) throws DAOException {
		//System.out.println("OK");
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		//String c;
		try {
			con = ConnectionPool.getInstance().takeConnection();
			//System.out.println("OK2");
			st = con.prepareStatement("select * from users where login=? and password=?");
	
			st.setString(1, login);
			st.setString(2, password);
			//System.out.println("OK2.5");
			rs = st.executeQuery();
			//System.out.println("OK3" + login + " - " + password);
			
			if (!rs.next()) {
				return null;
			}
			
			
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
			
			/*if (!rs.next()) {
				return null;
			}*/
			
			System.out.println("ccccc");
			User user = new User();
			user.setName(rs.getString("name"));
			user.setSurname(rs.getString("surname"));
			//c = user.getName();
			//System.out.println(c);
			return user;
			
		}  catch (SQLException e) {
			throw new DAOException("Logination sql error..", e);
		} catch (ConnectionPoolException e) {
			throw new DAOException("pool exception", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// logging
				}
			}

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
				//logging error
			}

		}

	}

	@Override
	public void addNewUser(String login, String password, String name, String surname) throws DAOException{
		Connection con = null;
		PreparedStatement st = null;
		

		try {
			con = ConnectionPool.getInstance().takeConnection();

			st = con.prepareStatement("INSERT INTO users (login, password, name, surname) VALUES (?, ?, ?, ?)");

			st.setString(1, login);
			st.setString(2, password);
			st.setString(3, name);
			st.setString(4, surname);
			
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
			
			}
		finally {

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

	@Override
	public ArrayList<User> getAllUsers() throws DAOException {
		ArrayList<User> users = new ArrayList<User>();
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = ConnectionPool.getInstance().takeConnection();
			st = con.prepareStatement("select * from users");
			rs = st.executeQuery();
		while (rs.next()){
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setSurname(rs.getString("surname"));
			user.setLogin(rs.getString("login"));
			user.setPassword(rs.getString("password"));
			users.add(user);
			
		}
		
		
		} catch (SQLException e) {
			
			throw new DAOException("Logination sql error..", e);
		
		} catch (ConnectionPoolException e) {
		
			throw new DAOException("pool exception", e);
		
	}
		finally {

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
		
		return users;
		


}

	@Override
	public void deleteUser(String name) throws DAOException {
		Connection con = null;
		PreparedStatement st = null;
		
		System.out.println("in dao");
		try {
			con = ConnectionPool.getInstance().takeConnection();
			st = con.prepareStatement("delete from users where name=?");
			st.setString(1, name);
			st.execute();
			System.out.println("in daopojo");
		}  catch (SQLException e) {
			throw new DAOException("Sql error..", e);
		} catch (ConnectionPoolException e) {
			throw new DAOException("pool exception", e);
		} 

			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// logging
				}
			
			try {
				ConnectionPool.getInstance().returnConnection(con);
			} catch (ConnectionPoolException e) {
				//logging error
			}

		}

	}

		
	}

			 