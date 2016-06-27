package by.htp3.hotel.bean;

public class Room {
	private int number;
	private String type;
	
	
	public Room(int number, String type){
		this.number = number;
		this.type = type;
		
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
