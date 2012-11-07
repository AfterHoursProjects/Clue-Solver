package enums;

import java.util.HashSet;

import model.Room;

public enum RoomEnum {
	KITCHEN(new Room("kitchen")),

	STUDY(new Room("study")),

	CONSERVATORY(new Room("conservatory")),

	HALL(new Room("hall")),

	DININGROOM(new Room("dining room")),

	BILLIARDROOM(new Room("billiard room")),

	LOUNGE(new Room("lounge")),

	LIBRARY(new Room("library")),

	BALLROOM(new Room("ballroom"));

	public static Iterable<String> getStringValues() {
		final HashSet<String> rooms = new HashSet<String>();
		for (final RoomEnum renum : values()) {
			rooms.add(renum.name());
		}

		return rooms;
	}

	private Room room;

	RoomEnum(Room room) {
		this.room = room;
	}

	public String getName() {
		return this.name();
	}

	public Room getRoom() {
		return this.room;
	}
}
