package by.htp3.hotel.bean;

public class Room {
	private int number;
	private String type;
	private int pricePerDay;
	private int floor;
	private int numberOfPlaces;
	private String status;
	
	
	
	public Room(){
		
	}
	
	public Room(int number, String type, int pricePerDay, int floor, int numberOfPlaces, String status) {
		
		this.number = number;
		this.type = type;
		this.pricePerDay = pricePerDay;
		this.floor = floor;
		this.numberOfPlaces = numberOfPlaces;
		this.status = status;
	}


	public int getPricePerDay() {
		return pricePerDay;
	}


	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}


	public int getNumberOfPlaces() {
		return numberOfPlaces;
	}


	public void setNumberOfPlaces(int numberOfPlaces) {
		this.numberOfPlaces = numberOfPlaces;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
