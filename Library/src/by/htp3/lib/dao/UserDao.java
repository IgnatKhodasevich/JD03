package by.htp3.lib.dao;

import java.util.List;

import by.htp3.lib.bean.Book;

public interface UserDao {
	List<Book> getCatalog();
	Book getBookByTitle(String title);
}
