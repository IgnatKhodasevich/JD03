package by.htp3.hotel.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp3.hotel.command.Command;
import by.htp3.hotel.command.impl.AddNewRoom;
import by.htp3.hotel.command.impl.AddNewRoomForm;
import by.htp3.hotel.command.impl.AddNewUserForm;
import by.htp3.hotel.command.impl.ChangeLanguage;
import by.htp3.hotel.command.impl.DeleteUser;
import by.htp3.hotel.command.impl.GetAllUsers;
import by.htp3.hotel.command.impl.GetAllRooms;
import by.htp3.hotel.command.impl.Logination;
import by.htp3.hotel.command.impl.Registration;

public final class CommandHelper {

	private static final CommandHelper instance = new CommandHelper();

	private Map<CommandName, Command> commands = new HashMap<>();

	private CommandHelper() {
		commands.put(CommandName.LOGINATION, new Logination());
		commands.put(CommandName.CHANGE_LANGUAGE, new ChangeLanguage());
		commands.put(CommandName.GET_ALL_ROOMS, new GetAllRooms());
		commands.put(CommandName.ADD_NEW_ROOM, new AddNewRoom());
		commands.put(CommandName.ADD_NEW_ROOM_FORM, new AddNewRoomForm());
		commands.put(CommandName.REGISTRATION, new Registration());
		commands.put(CommandName.ADD_NEW_USER_FORM, new AddNewUserForm());
		commands.put(CommandName.GET_ALL_USERS, new GetAllUsers());
		commands.put(CommandName.DELETE_USER, new DeleteUser());

	}

	public Command getCommand(String name) {
		name = name.replace('-', '_');
		CommandName commandName = CommandName.valueOf(name.toUpperCase());

		Command command = commands.get(commandName);

		return command;
	}

	public static CommandHelper getInstance() {
		return instance;
	}

}
