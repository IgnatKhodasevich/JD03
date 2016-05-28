package by.htp3.lib.service.impl;

import java.util.List;

import by.htp3.lib.bean.Book;
import by.htp3.lib.dao.AdminDao;
import by.htp3.lib.dao.DAOFactory;
import by.htp3.lib.dao.UserDao;
import by.htp3.lib.service.LibraryService;

public class LibraryServiceImpl implements LibraryService{

	@Override
	public Book findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBook(String titile, String author) {
		//validation
		
		Book book = new Book();// Book(title, author)
		
		DAOFactory factory = DAOFactory.getInstance();
		AdminDao adminDAo = factory.getAdminDao();
		
		// call method check
		adminDAo.addNewBook(book);
		
		return false;
	}

	@Override
	public List<Book> getCatalog() {
		
		DAOFactory factory = DAOFactory.getInstance();
		UserDao userDao = factory.getUserDao();
		
		List<Book> listBook = userDao.getCatalog();
		
		return listBook;
	}

}

















