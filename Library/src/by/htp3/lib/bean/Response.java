package by.htp3.lib.bean;

import java.util.List;

public class Response {
	private List<Book> listBook;
	private Book book;
	private String errorMessage;
	private String message;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Book> getListBook() {
		return listBook;
	}
	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
