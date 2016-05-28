package by.htp3.lib.service;

import java.util.List;

import by.htp3.lib.bean.Book;

public interface LibraryService {
	Book findByAuthor(String author);
	Book findByTitle(String title);
	boolean addBook(String titile, String author);
	List<Book> getCatalog();
}
