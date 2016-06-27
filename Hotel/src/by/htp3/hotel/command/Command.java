package by.htp3.hotel.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp3.hotel.service.exception.ServiceException;
import by.htp3.hotel.service.exception.ServiceRegisterException;



public interface Command {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ServiceRegisterException, ServiceException;
}
