package enums;

import model.Room;

public enum RoomEnum {
	KITCHEN(new Room("kitchen")), Study(new Room("study")), CONSERVATORY(
			new Room("conservatory")), HALL(new Room("hall")), DININGROOM(
			new Room("dining room")), BILLIARDROOM(new Room("billiard room")), LOUNGE(
			new Room("lounge")), LIBRARY(new Room("library")), BALLROOM(
			new Room("ballroom"));

	Room room;

	RoomEnum(Room room) {
		this.room = room;
	}

	public Room getRoom() {
		return this.room;
	}

	public static String[] getStringValues() {
		String[] names = new String[values().length];
		int i = 0;
		for (RoomEnum renum : values()) {
			names[i] = renum.name();
			i++;
		}
		return names;
	}
}
