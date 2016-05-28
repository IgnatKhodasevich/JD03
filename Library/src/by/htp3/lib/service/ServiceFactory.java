package by.htp3.lib.service;

import by.htp3.lib.service.impl.ClientServiceImpl;
import by.htp3.lib.service.impl.LibraryServiceImpl;

public class ServiceFactory {
	private static ServiceFactory factory = new ServiceFactory();

	private final ClientService clienService = new ClientServiceImpl();
	private final LibraryService libraryService = new LibraryServiceImpl();
	
	private ServiceFactory(){}
	
	public static ServiceFactory getInstance(){
		return factory;
	}
	
	public ClientService getClientService(){
		return clienService;
	}
	
	public LibraryService getLibraryService(){
		return libraryService;
	}
	
	
}
