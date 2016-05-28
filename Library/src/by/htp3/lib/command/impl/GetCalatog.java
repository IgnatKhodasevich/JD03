package by.htp3.lib.command.impl;

import java.util.List;

import by.htp3.lib.bean.Book;
import by.htp3.lib.bean.Request;
import by.htp3.lib.bean.Response;
import by.htp3.lib.command.Command;
import by.htp3.lib.service.LibraryService;
import by.htp3.lib.service.ServiceFactory;

public class GetCalatog implements Command{

	@Override
	public Response execute(Request request) {
		// TODO Auto-generated method stub
		
		ServiceFactory factory = ServiceFactory.getInstance();
		LibraryService service = factory.getLibraryService();
		
		
		List<Book> books = service.getCatalog();
		
		Response response = new Response();
		response.setErrorMessage(null);
		response.setListBook(books);
		
		return response;
	}

}
