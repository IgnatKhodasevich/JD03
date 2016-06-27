package by.htp3.hotel.dao.impl.pool;

public class ConnectionPoolException extends Exception {
	private static final long serialVersionUID = 1L;

	public ConnectionPoolException(String message){
		super(message);
	}
	
	public ConnectionPoolException(String message, Exception e){
		super(message, e);
	}	

}
