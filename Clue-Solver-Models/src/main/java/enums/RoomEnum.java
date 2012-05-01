package enums;

import model.Room;

public enum RoomEnum {
	KITCHEN(new Room("kitchen")), Study(new Room("study")), CONSERVATORY(new Room("conservatory")), HALL(new Room("hall")), DININGROOM(
			new Room("dining room")), BILLIARDROOM(new Room("billiard room")), LOUNGE(new Room("lounge")), LIBRARY(new Room(
			"library")), BALLROOM(new Room("ballroom"));

	Room room;

	RoomEnum(Room room) {
		this.room = room;
	}

	public Room getRoom() {
		return this.room;
	}
}
