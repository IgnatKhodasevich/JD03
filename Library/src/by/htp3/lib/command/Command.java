package by.htp3.lib.command;

import by.htp3.lib.bean.Request;
import by.htp3.lib.bean.Response;

public interface Command {
	Response execute(Request request);
}
