package by.htp3.lib.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp3.lib.bean.Book;
import by.htp3.lib.dao.UserDao;

public class SQLUserDao implements UserDao{

	@Override
	public List<Book> getCatalog() {
		// TODO Auto-generated method stub
		return new ArrayList<Book>();
	}

	@Override
	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
