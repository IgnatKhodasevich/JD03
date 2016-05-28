package by.htp3.lib.bean;

public class Book {
	private String title;
	private int price;

	public Book(){
		this.title = "";
		this.price = 0;
	}

	
	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
