package by.htp3.lib.dao;

import by.htp3.lib.bean.Book;

public interface AdminDao {
	boolean blockUser(int idUser);
	boolean addNewBook(Book book);
}
